package asd.booking.domain.discount;

public class Infant extends Passenger {

    private static final byte FROM_AGE = 0;
    private static final byte TO_AGE = 2;

    public Infant(DiscountType discountType, String name, String description) {
        super(discountType, name, description, FROM_AGE, TO_AGE);
    }
}
