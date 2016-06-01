/**
 * Created by CostaHu on 2016/5/11.
 */
public class Sale {
    private String seller;
    private String number;
    private int amount;
    private boolean available = false;

    //Init the constructor
    public void Sale(String seller,String number,int amount){
        this.seller = seller;
        this.number = number;
        this.amount = amount;
    }

    //Declare the getX() method for input information
    public String getSeller(){
        return seller;
    }
    public String getNumber(){
        return number;
    }
    public int getAmount(){
        return amount;
    }

    //Unfinished two methods for getting and checking amount
    public boolean checkAmount(){
        return available;
    }
    public int getDepositoryAmount(){
        return amount;
    }
}
