import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.SQLException;

public class AddingWindow extends JFrame {

    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField4;
    private JTextField textField2;
    private JButton powrotButton;
    private JButton zapiszButton;
    private JTextField textField3;
    private JFormattedTextField formattedTextField1;

    public AddingWindow() {
        super("AddingWindow");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        textField1.setDocument(new JTextFieldLimit(45));
        //textField2.setDocument(new JTextFieldLimit(2));
        AbstractDocument doc2 = (AbstractDocument) textField2.getDocument();
        doc2.setDocumentFilter(new NumericLimitDocumentFilter(2));
        //textField3.setDocument(new JTextFieldLimit(2));
        AbstractDocument doc3 = (AbstractDocument) textField3.getDocument();
        doc3.setDocumentFilter(new NumericLimitDocumentFilter(2));
        //textField4.setDocument(new JTextFieldLimit(2));
        AbstractDocument doc4 = (AbstractDocument) textField4.getDocument();
        doc4.setDocumentFilter(new NumericLimitDocumentFilter(2));

        powrotButton.addActionListener(new ActionListener() {
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
        zapiszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().isEmpty() || textField2.getText().isEmpty() || textField3.getText().isEmpty() || textField4.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Wypełnij wszystkie pola");
                    return;
                }
                if (Integer.parseInt(textField2.getText()) > 59 || Integer.parseInt(textField3.getText()) > 59 || Integer.parseInt(textField4.getText()) > 59) {
                    JOptionPane.showMessageDialog(null, "Podaj poprawny czas");
                    return;
                }
                //if ()
                String sql = "INSERT INTO mikrofalowka.jedzenie VALUES (null,?, ?, ?)";
                try (Connection conn = DBConnection.getConnection();
                     PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setString(1, textField1.getText());
                    pstmt.setTime(2, java.sql.Time.valueOf("00:"+ textField2.getText()+":"+ textField3.getText()));
                    pstmt.setTime(3, java.sql.Time.valueOf("00:00:"+ textField4.getText()));
                    pstmt.executeUpdate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField2.getText().length() == 2) {
                    textField3.requestFocus();
                }
                if (textField2.getText().length() > 2) {
                    textField2.setText(textField2.getText().substring(0, 2));
                }
            }
        });
    }
}
class JTextFieldLimit extends PlainDocument {
    private int limit;
    JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }
    JTextFieldLimit(int limit, boolean upper) {
        super();
        this.limit = limit;
    }
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null)
            return;
        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}
class NumericLimitDocumentFilter extends DocumentFilter {
    private int limit;

    public NumericLimitDocumentFilter(int limit) {
        if (limit <= 0) {
            throw new IllegalArgumentException("Limit can not be <= 0");
        }
        this.limit = limit;
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (this.limit > fb.getDocument().getLength() && string.matches("\\d*")) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (this.limit > fb.getDocument().getLength() && text.matches("\\d*")) {
            super.replace(fb, offset, length, text, attrs);
        }
    }
}
