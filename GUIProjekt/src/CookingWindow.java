import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;

public class CookingWindow extends JFrame{

    private JProgressBar progressBar1;
    private JPanel mainPannel;
    private JButton skipWaitingButton;
    private JLabel label1;

    private int czas;
    private String nazwa;
    private int temperatura;

    Jedzenie jedzenie;

    public CookingWindow(String name, int time,int temperature) {
        super("CookingWindow");
        this.setContentPane(this.mainPannel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,120);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        czas = time;
        System.out.println(czas);
        nazwa = name;
        temperatura = temperature;

        new ProgressWorker().execute();
    }

    private class ProgressWorker extends SwingWorker<Void, Void> {
        @Override
        public Void doInBackground() {
            final double[] counter = {0};
            while (counter[0] <= czas){
                System.out.println(Math.round((counter[0] /czas)*100));
                label1.setText("Proszę czekać ...");
                //textField1.setText("Czas to: " + czas);
                progressBar1.setValue((int) (Math.round((counter[0] /czas)*100)));
                skipWaitingButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        counter[0] = czas;
                    }
                });
                try {
                    Thread.sleep(160);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                counter[0] +=1;
            }
            return null;
        }

        @Override
        protected void done() {
            label1.setText("Gotowe!");
            int optT = 0;
            int pmT = 0;
            try (
                    Connection conn = DBConnection.getConnection();
                    Statement ps = conn.createStatement();
                    ResultSet rs = ps.executeQuery("SELECT * FROM mikrofalowka.jedzenie WHERE nazwa ='"+nazwa+"';")) {
                    rs.next();
                    LocalTime optimal = rs.getObject("optymalnyczasgotowania", LocalTime.class);
                    long optimalTime = optimal.toSecondOfDay();
                    optT = (int) optimalTime;
                    LocalTime plusminus = rs.getObject("czas_+-", LocalTime.class);
                    long plusminusTime = plusminus.toSecondOfDay();
                    pmT = (int) plusminusTime;
                    //System.out.println("Optimal time: " + optimalTime+ " +- " + plusminusTime);
                    //System.out.println(rs.getString("optymalnyczasgotowania") +" "+rs.getString("czas_+-"));
                    jedzenie = new Jedzenie(rs.getString("nazwa"),optT,pmT,rs.getInt("temperatura"));
                    System.out.println(jedzenie.getNazwa() + " " + jedzenie.getCzasGotowania() + " " + jedzenie.getCzasPlusMinus() + " " + jedzenie.getTemperatura());

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            if (czas>optT+pmT || temperatura>jedzenie.getTemperatura()){
                label1.setText("Za długo gotowane");
                dispose();
                OverCookedWindow overCookedWindow = new OverCookedWindow();
                overCookedWindow.setVisible(true);
            }else if (czas<optT-pmT || temperatura<jedzenie.getTemperatura()){
                label1.setText("Za krótko gotowane");
                dispose();
                UnderCookedWindow underCookedWindow = new UnderCookedWindow();
                underCookedWindow.setVisible(true);
            }else{
                label1.setText("Idealnie gotowane");
                dispose();
                CookedWindow cookedWindow = new CookedWindow();
                cookedWindow.setVisible(true);
            }

        }
    }
}