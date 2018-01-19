package usa.edu.mum.asd.labs.lab4.abstractfactory.product;

public class MickyBag extends ABag {

    public MickyBag() {
        super("Micky", 0.25F);
    }

    @Override
    public float getCost() {
        return getAmount();
    }
}
