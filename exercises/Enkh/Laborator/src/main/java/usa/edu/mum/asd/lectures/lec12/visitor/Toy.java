package usa.edu.mum.asd.lectures.lec12.visitor;

public class Toy implements OrderItem {

    private double price;
    private double weight;

    public Toy(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    //accept the visitor
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
