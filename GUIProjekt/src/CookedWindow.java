import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class CookedWindow extends JFrame {


    private JPanel panel1;
    private JButton powrotDoWyboruButton;

    public CookedWindow() {
        super("CookedWindow");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,120);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        powrotDoWyboruButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ChoosingWindow choosingWindow = null;
                try {
                    choosingWindow = new ChoosingWindow();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                choosingWindow.setVisible(true);
            }
        });
    }
}
