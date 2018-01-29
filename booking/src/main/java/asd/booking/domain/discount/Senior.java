package asd.booking.domain.discount;

public class Senior extends Passenger {

    private static final byte FROM_AGE = 65;
    private static final byte TO_AGE = Byte.MAX_VALUE;

    public Senior(DiscountType discountType, String name, String description) {
        super(discountType, name, description, FROM_AGE, TO_AGE);
    }
}
