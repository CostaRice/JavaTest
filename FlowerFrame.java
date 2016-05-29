import javax.swing.*;
import java.awt.*;

/**
 * Created by CostaHu on 2016/5/11.
 */
public class FlowerFrame extends JFrame {
    private JButton button = new JButton("OK");
    private JLabel lb1 = new JLabel("编号");
    private JLabel lb2 = new JLabel("名称");
    private JLabel lb3 = new JLabel("库存");
    public FlowerFrame(){
        JPanel panel = new JPanel(new GridLayout(3,4));
        panel.add(lb1);
        panel.add(lb2);
        panel.add(lb3);
        this.add(panel,BorderLayout.CENTER);
        this.add(button,BorderLayout.SOUTH);
    }
}
