import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MicrowaveFront extends JFrame {

    private JPanel front;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JTextPane timeTextPane;
    private JButton enterButton;
    private JButton clearButton;
    private JLabel wybraneLabel;

    public MicrowaveFront(String name) {
    super("MicrowaveFront");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,550);
    this.setVisible(true);
    this.setContentPane(this.front);
    this.setLocationRelativeTo(null);
        /*enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                CookingWindow cookingWindow = new CookingWindow();
                cookingWindow.setVisible(true);
            }
        });*/
        enterButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (number2.isEmpty() || number3.isEmpty() || number4.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Podaj czas");
                    return;
                }
                super.mouseClicked(e);
                dispose();
                CookingWindow cookingWindow = new CookingWindow(name, Integer.parseInt(number1 + number2)*60+Integer.parseInt(number3 + number4));
                cookingWindow.setVisible(true);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateTime(1);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateTime(2);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateTime(3);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateTime(4);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateTime(5);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateTime(6);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateTime(7);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateTime(8);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateTime(9);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateTime(0);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = "";
                number2 = "";
                number3 = "";
                number4 = "";
                timeTextPane.setText(" " + " " + ":" + " " + " ");
            }
        });
    }
    String number1 = "";
    String number2 = "";
    String number3 = "";
    String number4 = "";
    public void UpdateTime(int time){
        if (number4.length() == 0){
            number4 = Integer.toString(time);
        } else if (number3.length() == 0){
            number3 = number4;
            number4 = Integer.toString(time);

        } else if (number2.length() == 0){
            number2 = number3;
            number3 = number4;
            number4 = Integer.toString(time);

        } else if (number1.length() == 0){
            number1 = number2;
            number2 = number3;
            number3 = number4;
            number4 = Integer.toString(time);
        }
        timeTextPane.setText(number1 + number2 + ":" + number3 + number4);
    }
}
