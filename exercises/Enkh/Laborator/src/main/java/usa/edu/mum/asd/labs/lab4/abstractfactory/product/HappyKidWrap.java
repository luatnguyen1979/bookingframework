package usa.edu.mum.asd.labs.lab4.abstractfactory.product;

public class HappyKidWrap extends AWrap {

    public HappyKidWrap() {
        super("Happy Kid", 0.1F);
    }

    @Override
    public float getCost() {
        return getAmount();
    }
}
