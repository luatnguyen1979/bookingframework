package asd.booking.domain.discount.passenger;

import asd.booking.controller.discount.Discount;
import asd.booking.controller.discount.DiscountVisitor;
import asd.booking.domain.discount.calculation.Calculation;

public class Infant extends Passenger implements Discount {

    private static final byte FROM_AGE = 0;
    private static final byte TO_AGE = 2;

    public Infant(Integer id, Calculation calculation, String name, String description) {
        super(id, calculation, name, description, FROM_AGE, TO_AGE);
    }

    @Override
    public void accept(DiscountVisitor discountVisitor) {
        discountVisitor.visit(this);
    }
}
