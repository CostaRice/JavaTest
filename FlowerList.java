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

    //Create flowers in the list
    static Flower Rose = new Flower(ROSE_PRICE, ROSE_NUMBER);
    static Flower Carnation = new Flower(CARNATION_PRICE, CARNATION_NUMBER);
    static Flower Lily = new Flower(LILY_PRICE, LILY_NUMBER);
}
