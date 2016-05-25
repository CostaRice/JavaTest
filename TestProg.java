import javax.swing.*;

/**
 * Created by CostaHu on 2016/5/11.
 */
public class TestProg {
    public static void main(String[] args) {
        JFrame frame = new FlowersSalesFrame();
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("销售统计");
        frame.setVisible(true);
    }
}
