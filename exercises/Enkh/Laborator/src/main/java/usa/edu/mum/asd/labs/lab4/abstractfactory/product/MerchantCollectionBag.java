package usa.edu.mum.asd.labs.lab4.abstractfactory.product;

public class MerchantCollectionBag extends ABag {

    public MerchantCollectionBag() {
        super("Merchant Collection", 0.5F);
    }

    @Override
    public float getCost() {
        return getAmount();
    }
}
