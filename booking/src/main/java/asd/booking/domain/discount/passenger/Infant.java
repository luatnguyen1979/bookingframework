package asd.booking.domain.discount.passenger;

import asd.booking.controller.discount.IDiscount;
import asd.booking.controller.discount.DiscountVisitor;
import asd.booking.utils.PassengerType;

public class Infant extends Passenger implements IDiscount {


    public Infant(Integer id, String fullname, PassengerType passengerType) {
        super(id, fullname, passengerType);
    }

    @Override
    public void accept(DiscountVisitor discountVisitor) {
        discountVisitor.visit(this);
    }

}
