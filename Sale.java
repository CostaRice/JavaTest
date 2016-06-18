/**
 * Created by CostaHu on 2016/5/11.
 */
public class Sale {
    String seller;
    String number;
    int amount;
    private boolean available = false;
    static int count = 0;

    //Init the constructor
    Sale(String seller, String number, int amount) {
        this.seller = seller;
        this.number = number;
        this.amount = amount;
        count++;
    }

    //Declare the getX() method for input information
    public String getSeller() {
        return seller;
    }

    public String getNumber() {
        return number;
    }

    public int getAmount() {
        return amount;
    }

    //Unfinished two methods for getting and checking amount
    public boolean checkAmount() {
        return available;
    }

    //Get name from flower number
    public String getName(Sale sale){
        if (sale.getNumber().equals("001")){
            return "玫瑰";
        }
        if (sale.getNumber().equals("002")){
            return "康乃馨";
        }
        if (sale.getNumber().equals("003")){
            return "茉莉";
        }
        else
            return "wrong number";
    }

    //Get price for the flower
    public double getPrice(Sale sale){
        if (sale.getNumber().equals("001"))
            return FlowerList.ROSE_PRICE;
        if (sale.getNumber().equals("002")){
            return FlowerList.CARNATION_PRICE;
        }
        if (sale.getNumber().equals("003")){
            return FlowerList.LILY_PRICE;
        }
        else
            return 0.0;
    }
}
