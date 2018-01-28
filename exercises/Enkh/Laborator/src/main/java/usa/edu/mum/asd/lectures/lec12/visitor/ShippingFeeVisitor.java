package usa.edu.mum.asd.lectures.lec12.visitor;

public class ShippingFeeVisitor implements Visitor {

    private double totalShippingFee;

    // collect data about the book
    public void visit(Book book) {
        // assume shipping fee is related to weight and price
        // free shipping for all books over $10
        if (book.getPrice() < 10.0) {
            totalShippingFee += book.getWeight() * 2;
        }
    }

    public void visit(DVD dvd) {
        // free shipping for all DVDs
    }

    public void visit(Toy toy) {
        // free shipping for all DVDs
        totalShippingFee += 1.50;
    }

    public double getTotalShippingFee() {
        return totalShippingFee;
    }
}