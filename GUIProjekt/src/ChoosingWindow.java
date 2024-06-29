import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ChoosingWindow extends JFrame{
    private JButton nextButton;
    private javax.swing.JPanel JPanel1;
    private JList list1;
    private JButton dodajJedzenieButton;

    public ChoosingWindow() throws SQLException {
        super("ChoosingWindow");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,300);
        this.setContentPane(this.JPanel1);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        DefaultListModel demoLista = new DefaultListModel();
        try (
                Connection conn = DBConnection.getConnection();
                Statement ps = conn.createStatement();
                ResultSet rs = ps.executeQuery("SELECT * FROM mikrofalowka.jedzenie;")) {
            while (rs.next()) {
                //System.out.println(rs.getString("nazwa"));
                demoLista.addElement(rs.getString("nazwa"));
            }
            list1.setModel(demoLista);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Błąd połączenia z bazą danych, uruchom baze danych i kliknij OK",
                    "Uwaga", JOptionPane.ERROR_MESSAGE);
            dispose();
            ChoosingWindow choosingWindow = new ChoosingWindow();
            choosingWindow.setVisible(true);
        }

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (list1.getSelectedValue() == null) {
                    JOptionPane.showMessageDialog(null, "Wybierz jedzenie");
                    return;
                }
                dispose();
                MicrowaveFront microwaveFront = new MicrowaveFront(list1.getSelectedValue().toString());
                microwaveFront.setVisible(true);
            }
        });

        dodajJedzenieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddingWindow addingWindow = new AddingWindow();
                addingWindow.setVisible(true);
            }
        });
    }
}