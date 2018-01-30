package asd.booking.domain.discount.passenger;

import asd.booking.controller.discount.Discount;
import asd.booking.controller.discount.DiscountVisitor;
import asd.booking.domain.discount.calculation.Calculation;

public class Senior extends Passenger implements Discount {

    private static final byte FROM_AGE = 65;
    private static final byte TO_AGE = Byte.MAX_VALUE;

    public Senior(Integer id, Calculation calculation, String name, String description) {
        super(id, calculation, name, description, FROM_AGE, TO_AGE);
    }

    @Override
    public void accept(DiscountVisitor discountVisitor) {
        discountVisitor.visit(this);
    }
}
