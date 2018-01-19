package usa.edu.mum.asd.labs.lab4.abstractfactory.product;

public abstract class ABag implements Packaging {

    private final String name;
    private final Float amount;

    public ABag(String name, Float amount) {
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
