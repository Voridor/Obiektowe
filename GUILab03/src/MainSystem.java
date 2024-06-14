import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSystem extends JFrame{
    private JPanel PanelMainSystem;
    private JButton wyjscieButton;
    private JButton wylogujButton;
    private JButton radioButtonButton;
    private JButton checkBoxButton;
    private JButton kalkulatorButton;
    private int width = 400, height = 300;

    public MainSystem(){
        super("Logowanie do systemu");
        this.setContentPane(this.PanelMainSystem);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width,height);
        this.setLocationRelativeTo(null);

        radioButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                RadioForm radioForm = new RadioForm();
                radioForm.setVisible(true);
            }
        });
        checkBoxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                CheckBoxForm checkBoxForm = new CheckBoxForm();
                checkBoxForm.setVisible(true);
            }
        });
        kalkulatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Example example = new Example();
                example.setVisible(true);
            }
        });

        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        wylogujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginForm loginForm = new LoginForm();
                loginForm.setVisible(true);
            }
        });
    }
}
