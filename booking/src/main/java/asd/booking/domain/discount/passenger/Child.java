package asd.booking.domain.discount.passenger;

import asd.booking.domain.discount.Discount;
import asd.booking.domain.discount.DiscountVisitor;
import asd.booking.domain.discount.calculation.Calculation;

public class Child extends Passenger implements Discount {

    private static final byte FROM_AGE = 3;
    private static final byte TO_AGE = 11;

    public Child(Calculation calculation, String name, String description) {
        super(calculation, name, description, FROM_AGE, TO_AGE);
    }

    @Override
    public void accept(DiscountVisitor discountVisitor) {
        discountVisitor.visit(this);
    }
}
