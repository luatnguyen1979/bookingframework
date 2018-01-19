package usa.edu.mum.asd.labs.lab4.abstractfactory.product;

public class EverydayValueWrap extends AWrap {

    public EverydayValueWrap() {
        super("Everyday Value", 0F);
    }

    @Override
    public float getCost() {
        return getAmount();
    }
}
