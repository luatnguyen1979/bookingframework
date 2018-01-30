package asd.booking.domain.discount;

public interface Discount {

    public void accept(DiscountVisitor discountVisitor);
}
