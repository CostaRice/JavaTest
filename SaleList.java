import java.io.*;

/**
 * Created by CostaHu on 2016/5/11.
 */
public class SaleList{
    SaleList(){
        try {
            File file = new File("sales.txt");
            PrintWriter output = new PrintWriter(new FileOutputStream(file));
            output.println("花卉销售统计");
            output.println("==========================");
        }
       catch (FileNotFoundException e){
           e.printStackTrace();
       }
    }
    SaleList(Sale sale){
        try{
            File file = new File("sales.txt");
            PrintWriter output = new PrintWriter(new FileOutputStream(file));
            output.println("花卉销售统计");
            output.println("==========================");
            output.append(sale.getNumber()+"号"+"\t");
            output.append(sale.getName(sale)+" : ");
            output.append("单价"+sale.getPrice(sale)+"\t");
            output.append("销售员"+"\n"+sale.getSeller()+"\t");
            output.append(sale.getAmount()+" @￥"+sale.getPrice(sale)+"="+"￥"+sale.getPrice(sale)*sale.getAmount());
            output.println("==========================");
            output.append("总销量"+":"+sale.getAmount()+sale.getAmount()*sale.getPrice(sale));
            output.append("==========================");
            output.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}