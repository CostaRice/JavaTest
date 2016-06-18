import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    JTextArea jta = new JTextArea();

    //Set the TextArea after press the button jbt_sm
    public void setSaleRecord(Sale sale){
        jta.append("\n"+Integer.toString(sale.count)+"\t");
        jta.append(sale.getNumber()+"\t");
        jta.append(sale.getName(sale)+"\t");
        jta.append(sale.getSeller()+"\t");
        jta.append(Integer.toString(sale.getAmount())+"\t");
        jta.append(Double.toString(sale.getPrice(sale))+"\t");
        jta.append(Double.toString(sale.getPrice(sale)*sale.getAmount())+"\t");
    }

    //Declare two instances of class Sale and FlowerList
    FlowerList flowerList = new FlowerList();

    //Init the constructor
    public FlowersSalesFrame() {

        //Construct the up area
        JPanel panel = new JPanel(new GridLayout(1, 3, 10, 5));
        panel.add(jbt_kc);
        panel.add(jbt_tb);
        panel.add(jbt_se);
        this.add(panel, BorderLayout.NORTH);

        //Construct the down left area
        JPanel panel1 = new JPanel(new GridLayout(1, 2));
        panel1.add(jbt_sm);
        panel1.add(jbt_cr);

        //Construct the down right area
        JPanel panel2 = new JPanel(new GridLayout(3, 2));
        panel2.add(jlb_sl);
        panel2.add(jtf_sl);
        panel2.add(jlb_nb);
        panel2.add(jtf_nb);
        panel2.add(jlb_at);
        panel2.add(jtf_at);

        //Combine the two areas as the down area
        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.add(panel1, BorderLayout.EAST);
        panel3.add(panel2, BorderLayout.WEST);
        this.add(panel3, BorderLayout.SOUTH);

        //Construct the middle area
        this.add(jta, BorderLayout.CENTER);
        jta.setText("序号\t"+"编号\t"+"名称\t"+"销售员\t"+"数量\t"+"单价\t"+"总价\t");


        //Register listener to the button jbt_kc
        jbt_kc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new FlowerFrame();
                frame.setSize(600,400);
                frame.setLocationRelativeTo(null);
                frame.setTitle("库存信息");
                frame.pack();
                frame.setVisible(true);
            }
        });

        //Register listener to JButton jbt_se
        jbt_sm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) throws IllegalArgumentException {
                FlowerList flowerList = new FlowerList();
                String input_number = jtf_nb.getText();
                String input_seller = jtf_sl.getText();
                int input_amount = Integer.parseInt(jtf_at.getText());

                if (input_number.equals(flowerList.ROSE_NUMBER)) {
                    if(input_amount <= flowerList.getRose_Amount()){
                        Sale sale = new Sale(input_seller,input_number,input_amount);
                        flowerList.setRose_Amount(input_amount);
                        setSaleRecord(sale);
                    }
                    else
                        throw new IllegalArgumentException("Wrong input for rose amount !!!");
                }
                else if (input_number.equals(flowerList.CARNATION_NUMBER)){
                    if (input_amount <= flowerList.getCarnation_Amount()){
                        Sale sale = new Sale(input_seller,input_number,input_amount);
                        flowerList.setCarnation_Amount(input_amount);
                        setSaleRecord(sale);
                    }
                    else
                        throw new IllegalArgumentException("Wrong input for carnation amount!!!");
                }
                else if (input_number.equals(flowerList.LILY_NUMBER)){
                    if (input_amount<=flowerList.getLily_Amount()){
                        Sale sale = new Sale(input_seller,input_number,input_amount);
                        flowerList.setLily_Amount(input_amount);
                        setSaleRecord(sale);
                    }
                    else
                        throw new IllegalArgumentException("Wrong input for lily amount!!!" );
                }
                else
                    throw new IllegalArgumentException("Wrong input for flower number");
            }
        });

        //Add listener for jbt_cr
        jbt_cr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf_sl.setText("");
                jtf_at.setText("");
                jtf_nb.setText("");
            }
        });

        //Add listener for jbt_tb
        jbt_tb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new ChartFrame();
                frame.setLocationRelativeTo(null);
                frame.setSize(400,300);
                frame.setTitle("销售图表");
                frame.setVisible(true);
            }
        });
    }
}
