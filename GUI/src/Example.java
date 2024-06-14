import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Example extends JFrame{
    private JPanel JPanel1;
    private JButton kliknijMnieButton;
    private JButton wyjscieButton;
    private JTextField textField1;
    private JLabel lblWelcome;
    int width = 500,height= 400;

    public static void main(String[] args) {
        Example example = new Example();
        example.setVisible(true);
    }

    public Example(){
        super("Example");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width,height);


        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        kliknijMnieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*String text = JOptionPane.showInputDialog("Podaj imie");
                JOptionPane.showMessageDialog(null,"Witaj "+ text, "Uwaga",JOptionPane.WARNING_MESSAGE);*/
                //lblWelcome.setText(new Date().toString());
                String text = textField1.getText();
                lblWelcome.setText(text);
            }
        });
    }
}
