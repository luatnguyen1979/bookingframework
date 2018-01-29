package asd.booking.domain.discount;

public class Adult extends Passenger {

    private static final byte FROM_AGE = 13;
    private static final byte TO_AGE = 64;

    public Adult(DiscountType discountType, String name, String description) {
        super(discountType, name, description, FROM_AGE, TO_AGE);
    }
}
