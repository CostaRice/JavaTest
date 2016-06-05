/**
 * Created by CostaHu on 2016/5/11.
 */
public class FlowerList extends Flower{
    //Add price for each kind of flower
    static double ROSE_PRICE = 5.0;
    static double CARNATION_PRICE = 3.5;
    static double LILY_PRICE = 3.0;

    //Add number for each kind of flower
    static String ROSE_NUMBER = "001";
    static String CARNATION_NUMBER = "002";
    static String LILY_NUMBER = "003";

    //Add repository amount for each kinds of flowers
    static int rose_Amount = 100;
    static int carnation_Amount = 100;
    static int lily_Amount = 100;

    //Create flowers in the list
    static Flower Rose = new Flower(ROSE_PRICE, ROSE_NUMBER);
    static Flower Carnation = new Flower(CARNATION_PRICE, CARNATION_NUMBER);
    static Flower Lily = new Flower(LILY_PRICE, LILY_NUMBER);

    protected void setRose_Amount(int amount){
        rose_Amount -= amount;
    }
    protected  void setCarnation_Amount(int amount){
        carnation_Amount -= amount;
    }
    protected void setLily_Amount(int amount){
        lily_Amount -= amount;
    }

    protected int getRose_Amount(){
        return rose_Amount;
    }
    protected int getCarnation_Amount(){
        return carnation_Amount;
    }
    protected int getLily_Amount(){
        return lily_Amount;
    }
}
