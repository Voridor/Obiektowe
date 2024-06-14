import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumaButton;
    private JButton iloczynButton;
    private JButton roznicaButton;
    private JButton ilorazButton;
    private JButton wyjscieButton;
    private JButton wyczyscButton;
    private JLabel lblOpen;

    double valueA = 0,valueB = 0,score = 0;

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setVisible(true);
    }

    public Kalkulator() {
        super("Kalkulator");
        this.setContentPane(this.getContentPane());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        wyczyscButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                lblOpen.setText("Tu pojawi się wynik działania");
            }
        });
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textField1.getText());
                valueB = Double.parseDouble(textField2.getText());
                score = valueA + valueB;
                lblOpen.setText("Wyjscie: " + score);
            }
        });
    }
}
