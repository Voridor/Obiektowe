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

    private boolean isTimeSet = false;
    private int calkowityCzas = 0;

    public MicrowaveFront(String name) {
    super("MicrowaveFront");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,550);
    this.setVisible(true);
    this.setContentPane(this.front);
    this.setLocationRelativeTo(null);
    JOptionPane.showMessageDialog(null, "Wpisz czas gotowania w minutach i sekundach");
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
                if (!isTimeSet && (number2.isEmpty() || number3.isEmpty() || number4.isEmpty())){
                    JOptionPane.showMessageDialog(null, "Podaj czas");
                    return;
                }else if (!isTimeSet){
                    isTimeSet = true;
                    calkowityCzas = Integer.parseInt(number1 + number2)*60+Integer.parseInt(number3 + number4);
                    timeTextPane.setText("");
                    number1 = "";
                    number2 = "";
                    number3 = "";
                    number4 = "";
                }
                if (isTimeSet && (number2.isEmpty() || number3.isEmpty() || number4.isEmpty())){
                    JOptionPane.showMessageDialog(null, "Podaj temperaturę");
                    }else {
                        dispose();
                        CookingWindow cookingWindow = new CookingWindow(name, calkowityCzas, Integer.parseInt(number2 + number3 + number4));
                        cookingWindow.setVisible(true);
                    }

                super.mouseClicked(e);
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
        if (!isTimeSet) {
            if (number4.isEmpty()) {
                number4 = Integer.toString(time);
            } else if (number3.isEmpty()) {
                number3 = number4;
                number4 = Integer.toString(time);

            } else if (number2.isEmpty()) {
                number2 = number3;
                number3 = number4;
                number4 = Integer.toString(time);

            } else if (number1.isEmpty()) {
                number1 = number2;
                number2 = number3;
                number3 = number4;
                number4 = Integer.toString(time);
            }
            timeTextPane.setText(number1 + number2 + ":" + number3 + number4);
        }else{
            if (number4.isEmpty()) {
                number4 = Integer.toString(time);
            } else if (number3.isEmpty()) {
                number3 = number4;
                number4 = Integer.toString(time);

            } else if (number2.isEmpty()) {
                number2 = number3;
                number3 = number4;
                number4 = Integer.toString(time);
            }
            timeTextPane.setText(number2 + number3 + number4);
            System.out.println(number2 + number3 + number4);
        }
    }
}
