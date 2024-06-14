import javax.swing.*;

public class WelcomeForm extends JFrame {
    private JPanel PanelWelcome;
    private JProgressBar progressBar1;
    private JLabel lblProszeCzekac;
    private int width = 400, height = 300;

    public WelcomeForm(){
        super("Laboratorium 2");
        this.setContentPane(this.PanelWelcome);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width,height);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        progression();
    }

    private void progression(){
        int counter = 0;
        while (counter <= 100){
            lblProszeCzekac.setText("Proszę czekać ...");
            progressBar1.setValue(counter);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            counter+=5;
        }
        dispose();
        //otworzenei kolejnego form
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }

}
