import javax.swing.*;
import java.awt.*;

/**
 * Created by CostaHu on 2016/5/11.
 */
public class FlowersSalesFrame extends JFrame{

    private JButton jbt_kc = new JButton("显示库存");
    private JButton jbt_tb = new JButton("销售图表");
    private  JButton jbt_se = new JButton("保存并退出");
    private JButton jbt_sm = new JButton("提交");
    private JButton jbt_cr = new JButton("清空");
    private JLabel jlb_sl = new JLabel("销售员");
    private JLabel jlb_nb = new JLabel("商品编号");
    private JLabel jlb_at= new JLabel("数量");
    private JTextField jtf_sl = new JTextField(16);
    private JTextField jtf_nb = new JTextField(16);
    private JTextField jtf_at = new JTextField(16);
    private JTextArea jta = new JTextArea();

    //Init the constructor
    public FlowersSalesFrame(){
        //Construct the up area
        JPanel panel = new JPanel(new GridLayout(1,3,10,5));
        panel.add(jbt_kc);
        panel.add(jbt_tb);
        panel.add(jbt_se);
        this.add(panel,BorderLayout.NORTH);
       //Construct the down left area
        JPanel panel1 = new JPanel(new GridLayout(2,1));
        panel1.add(jbt_sm);
        panel1.add(jbt_cr);
        //Construct the down right area
        JPanel panel2 = new JPanel(new GridLayout(3,2));
        panel2.add(jlb_sl);
        panel2.add(jtf_sl);
        panel2.add(jlb_nb);
        panel2.add(jtf_nb);
        panel2.add(jlb_at);
        panel2.add(jtf_at);
        //Combine the two areas as the down area
        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.add(panel1,BorderLayout.WEST);
        panel3.add(panel2,BorderLayout.EAST);
        this.add(panel3,BorderLayout.SOUTH);
        //Construct the middle area
        this.add(jta,BorderLayout.CENTER);
    }
}
