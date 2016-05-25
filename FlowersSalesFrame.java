import javax.swing.*;
import java.awt.*;

/**
 * Created by CostaHu on 2016/5/11.
 */
public class FlowersSalesFrame extends JFrame{

    private JButton jbt_kc = new JButton("显示库存");
    private JButton jbt_tb = new JButton("销售图表");
    private  JButton jbt_se = new JButton("保存并退出");

    //Init the constructor
    public FlowersSalesFrame(){
        JPanel panel = new JPanel();
        panel.add(jbt_kc);
        panel.add(jbt_tb);
        panel.add(jbt_se);
        this.add(panel,BorderLayout.NORTH);
    }
}
