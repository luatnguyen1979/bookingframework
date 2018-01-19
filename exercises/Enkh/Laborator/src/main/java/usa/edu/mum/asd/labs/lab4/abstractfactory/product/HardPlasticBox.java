package usa.edu.mum.asd.labs.lab4.abstractfactory.product;

public class HardPlasticBox extends ABox {

    public HardPlasticBox() {
        super("Hard Plastic", 1F);
    }

    @Override
    public float getCost() {
        return getAmount();
    }
}
