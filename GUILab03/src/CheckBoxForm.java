import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxForm extends JFrame {
    private JPanel PanelChexBox;
    private JButton wyjscieButton;
    private JButton wsteczButton;
    private JButton okButton;
    private JCheckBox javaCheckBox;
    private JCheckBox sharpCheckBox;
    private JCheckBox cCheckBox;
    private JCheckBox pythonCheckBox;
    private int width = 400, height = 300;

    public CheckBoxForm(){
        super("Laboratorium 2");
        this.setContentPane(this.PanelChexBox);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width,height);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double kosztWszystkiego = 0;
                String kursyS = new String();
                if(javaCheckBox.isSelected()){
                    kosztWszystkiego += 3500;
                    kursyS += javaCheckBox.getText()+"\n";
                }
                if(sharpCheckBox.isSelected()){
                    kosztWszystkiego += 4500;
                    kursyS += sharpCheckBox.getText()+"\n";
                }
                if(cCheckBox.isSelected()){
                    kosztWszystkiego += 4000;
                    kursyS += cCheckBox.getText()+"\n";
                }
                if(pythonCheckBox.isSelected()){
                    kosztWszystkiego += 5000;
                    kursyS += pythonCheckBox.getText()+"\n";
                }

                JOptionPane.showMessageDialog(null,kursyS+"-----------------\n Razem: "+kosztWszystkiego,"Kursy",JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
