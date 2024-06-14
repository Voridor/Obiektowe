import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioForm extends JFrame{
    private JPanel PanelRadio;
    private JButton wyjscieButton;
    private JButton wsteczButton;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macintoshRadioButton;
    private JLabel iconLabel;
    private JButton okButton;

    private int width = 600, height = 400;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("Linux.png"));
    private ImageIcon iconWin = new ImageIcon(getClass().getResource("Windows.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("Apple.png"));

    //metoda do resize rysunku
    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight){
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }


    public RadioForm(){
        super("Laboratorium 2");
        this.setContentPane(this.PanelRadio);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width,height);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(linuxRadioButton.isSelected()){
                    iconLabel.setIcon(resize(iconLinux,120,120));
                }
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (windowsRadioButton.isSelected()) {
                    iconLabel.setIcon(resize(iconWin,200,120));
                }
            }
        });
        macintoshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (macintoshRadioButton.isSelected()) {
                    iconLabel.setIcon(resize(iconMac,120,120));
                }
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sys = new String();
                if(linuxRadioButton.isSelected()){
                    sys = "Linux";
                }else if(windowsRadioButton.isSelected()){
                    sys = "Windows";
                }else if(macintoshRadioButton.isSelected()){
                    sys = "Macintosh";
                }
                JOptionPane.showMessageDialog(null,"Wybrałeś "+ sys,"Wiadomość", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        wsteczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MainSystem mainSystem = new MainSystem();
                mainSystem.setVisible(true);
            }
        });
    }
}
