import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CostaHu on 2016/5/11.
 */
//库存信息窗口
public class FlowerFrame extends JFrame {
    private JButton button = new JButton("OK");
    private JLabel lb1 = new JLabel("编号");
    private JLabel lb2 = new JLabel("名称");
    private JLabel lb3 = new JLabel("库存");
    public FlowerFrame(){
        //Construct the main frame
        JPanel panel = new JPanel(new GridLayout(4,3));
        panel.add(lb1);
        panel.add(lb2);
        panel.add(lb3);

        this.add(panel,BorderLayout.CENTER);
        this.add(button,BorderLayout.SOUTH);
        //Add listener to the button,,close the frame when press the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}
