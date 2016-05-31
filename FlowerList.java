/**
 * Created by CostaHu on 2016/5/11.
 */
public class FlowerList extends Flower{
    //Add price for each kind of flower
    final double ROSE_PRICE = 5.0;
    final double CARNATION_PRICE = 3.5;
    final double LILY_PRICE = 3.0;

    //Add number for each kind of flower
    final String ROSE_NUMBER = "001";
    final String CARNATION_NUMBER = "002";
    final String LILY_NUMBER = "003";

    //Create flowers in the list
    Flower Rose = new Flower(ROSE_PRICE, ROSE_NUMBER);
    Flower Carnation = new Flower(CARNATION_PRICE, CARNATION_NUMBER);
    Flower Lily = new Flower(LILY_PRICE, LILY_NUMBER);

    //Add getPrice() method for flowers in the list
    public double getROSE_PRICE(){
        return ROSE_PRICE;
    }
    public double getCARNATION_PRICE(){
        return CARNATION_PRICE;
    }
    public double getLILY_PRICE(){
        return LILY_PRICE;
    }

    //Add getAmount() method for flowers in the list
    public int getRoseAmount(){
        return Rose.getAmount();
    }
    public int getCarnationAmount(){
        return Carnation.getAmount();
    }

    //Add setAmount() method for flowers in the list
    public int setRoseAmount(int amount){
        Rose.setAmount(amount);
        return Rose.getAmount();
    }
    public int setCarnationAmount(int amount){
        Carnation.setAmount(amount);
        return Carnation.getAmount();
    }
    public int setLilyAmount(int amount){
        Lily.setAmount(amount);
        return Lily.getAmount();
    }
}
