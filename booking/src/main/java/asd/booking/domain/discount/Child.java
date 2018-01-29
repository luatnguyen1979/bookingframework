package asd.booking.domain.discount;

public class Child extends Passenger {

    private static final byte FROM_AGE = 3;
    private static final byte TO_AGE = 11;

    public Child(DiscountType discountType, String name, String description) {
        super(discountType, name, description, FROM_AGE, TO_AGE);
    }
}
