/**
 * Created by CostaHu on 2016/5/11.
 */
public class Flower {
    //two basic variables for the Flower class
    private double price;
    private int amount = 100;
    private String number;
    //Init the constructor
    public Flower(){
    }
    protected Flower(double price,String number){
        this.price = price;
        this.number = number;
    }
    //Set flower price
    protected void setPrice(double price){
        this.price = price;
    }
    //Set new amount
    protected void  setAmount(int amount){
        this.amount = amount;
    }
    //Get flower price
    protected  double getPrice(){
        return price;
    }
    //Get the present amount
    protected int getAmount(){
        return amount;
    }
}
