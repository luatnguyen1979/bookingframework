package usa.edu.mum.asd.labs.lab4.abstractfactory.product;

public class CartoonBox extends ABox {

    public CartoonBox() {
        super("Cartoon", 0.5F);
    }

    @Override
    public float getCost() {
        return getAmount();
    }
}
