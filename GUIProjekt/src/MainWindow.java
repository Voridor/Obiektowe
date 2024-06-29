import javax.swing.*;

public class MainWindow extends JFrame{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JPanel KeyPad;
    private JPanel mirkofalowka;

    public MainWindow() {
        JFrame frame = new JFrame("MainWindow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100,600);
        frame.setVisible(true);
        frame.setContentPane(this.mirkofalowka);
    }
}
