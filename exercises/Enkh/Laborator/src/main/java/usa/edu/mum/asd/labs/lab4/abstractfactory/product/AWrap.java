package usa.edu.mum.asd.labs.lab4.abstractfactory.product;

public abstract class AWrap implements Packaging {

    private final String name;
    private final Float amount;

    public AWrap(String name, Float amount) {
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
