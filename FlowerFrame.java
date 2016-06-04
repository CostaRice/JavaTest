import com.sun.corba.se.spi.activation.Repository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CostaHu on 2016/5/11.
 */
//库存信息窗口
public class FlowerFrame extends JFrame {
    //Create label for the charm
    private JButton button = new JButton("OK");
    private JLabel lb1 = new JLabel("编号");
    private JLabel lb2 = new JLabel("名称");
    private JLabel lb3 = new JLabel("库存");

    private JLabel rose_Number = new JLabel("001");
    private JLabel rose_Name = new JLabel("玫瑰");
    private JLabel rose_Amount = new JLabel();

    private JLabel carnation_Number = new JLabel("002");
    private JLabel carnation_Name = new JLabel("康乃馨");
    private JLabel carnation_Amount = new JLabel();

    private JLabel lily_Number = new JLabel("003");
    private JLabel lily_Name = new JLabel("茉莉");
    private JLabel lily_Amount = new JLabel();


    public FlowerFrame(){
        //Construct the main frame
        JPanel panel = new JPanel(new GridLayout(4, 3));
        panel.add(lb1);
        panel.add(lb2);
        panel.add(lb3);
        //Second line for rose
        panel.add(rose_Number);
        panel.add(rose_Name);
        panel.add(rose_Amount);
        //Third line for carnation
        panel.add(carnation_Number);
        panel.add(carnation_Name);
        panel.add(carnation_Amount);
        //Third line for lily
        panel.add(lily_Number);
        panel.add(lily_Name);
        panel.add(lily_Amount);

        this.add(panel, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);

        //Add listener to the button,,close the frame when press the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}