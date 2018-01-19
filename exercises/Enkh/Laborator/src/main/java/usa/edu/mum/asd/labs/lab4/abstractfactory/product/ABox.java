package usa.edu.mum.asd.labs.lab4.abstractfactory.product;

public abstract class ABox implements Packaging {

    private final String name;
    private final Float amount;

    public ABox(String name, Float amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Float getAmount() {
        return amount;
    }
}
