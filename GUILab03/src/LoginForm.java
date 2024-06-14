import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelLogin;
    private JPasswordField Userpassword;
    private JTextField userName;
    private JButton wyjscieButton;
    private JButton zalogujButton;
    private int width = 400, height = 300;
    String user = "admin", password = "admin";

    public LoginForm(){
        super("Logowanie do systemu");
        this.setContentPane(this.panelLogin);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width,height);
        this.setLocationRelativeTo(null);

        zalogujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userNameInput = userName.getText();
                String userPasswordInput = new String(Userpassword.getPassword());

                if (userNameInput.equals(user) && userPasswordInput.equals(password)){
                    dispose();
                    //otwracie kolejengo form
                    MainSystem mainSystem = new MainSystem();
                    mainSystem.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Podano błedne dane",
                            "Błąd logowania", JOptionPane.ERROR_MESSAGE);
                    userName.setText("");
                    Userpassword.setText("");
                }
            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
