package asd.booking.controller.discount;

public interface Discount {

    public void accept(DiscountVisitor discountVisitor);
}
