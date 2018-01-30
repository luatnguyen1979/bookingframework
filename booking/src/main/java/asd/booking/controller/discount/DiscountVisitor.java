package asd.booking.controller.discount;

import asd.booking.domain.discount.passenger.Adult;
import asd.booking.domain.discount.passenger.Child;
import asd.booking.domain.discount.passenger.Infant;
import asd.booking.domain.discount.passenger.Senior;

public interface DiscountVisitor {

    public void visit(Adult adult);

    public void visit(Child child);

    public void visit(Senior senior);

    public void visit(Infant infant);

}
