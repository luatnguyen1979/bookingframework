package asd.booking.controller.discount;

import asd.booking.domain.discount.passenger.Adult;
import asd.booking.domain.discount.passenger.Child;
import asd.booking.domain.discount.passenger.Infant;
import asd.booking.domain.discount.passenger.Senior;

public class PassengerTypeVisitor implements DiscountVisitor {

    private Double regularPrice;
    private Double totalSave;

    public PassengerTypeVisitor(Double regularPrice) {
        this.regularPrice = regularPrice;
        this.totalSave = 0.0;
    }

    public void visit(Adult adult) {
        totalSave = totalSave + adult.getCalculation().getSave(regularPrice);
    }

    public void visit(Child child) {
        totalSave = totalSave + child.getCalculation().getSave(regularPrice);
    }

    public void visit(Senior senior) {
        totalSave = totalSave + senior.getCalculation().getSave(regularPrice);
    }

    public void visit(Infant infant) {
        totalSave = totalSave + infant.getCalculation().getSave(regularPrice);
    }

    public Double getTotalSave() {
        return totalSave;
    }
}
