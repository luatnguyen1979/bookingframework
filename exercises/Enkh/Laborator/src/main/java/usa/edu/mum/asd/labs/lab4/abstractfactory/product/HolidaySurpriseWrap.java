package usa.edu.mum.asd.labs.lab4.abstractfactory.product;

public class HolidaySurpriseWrap extends AWrap {

    public HolidaySurpriseWrap() {
        super("Holiday Surprise", 0.25F);
    }

    @Override
    public float getCost() {
        return getAmount();
    }
}
