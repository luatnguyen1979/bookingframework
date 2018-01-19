package usa.edu.mum.asd.labs.lab4.abstractfactory.product;

public class ReusableShopperBag extends ABag {

    public ReusableShopperBag() {
        super("Reusable Shopper", 0.0F);
    }

    @Override
    public float getCost() {
        return getAmount();
    }
}
