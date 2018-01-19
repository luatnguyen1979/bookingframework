package usa.edu.mum.asd.labs.lab4.abstractfactory.product;

public class PlainPaperBox extends ABox {

    public PlainPaperBox() {
        super("Plain paper", 0.25F);
    }

    @Override
    public float getCost() {
        return getAmount();
    }
}
