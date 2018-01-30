package asd.booking.controller.discount;

import asd.booking.domain.discount.calculation.Calculation;
import asd.booking.domain.discount.passenger.*;

import java.util.List;

public class PassengerGroupVisitor implements DiscountVisitor {

    private int currentMember;
    private int minMember;
    private Calculation calculation;
    private List<Passenger> memberList;
    private Double totalSave;

    public PassengerGroupVisitor(int minMember, Calculation calculation, List<Passenger> memberList) {
        this.minMember = minMember;
        this.calculation = calculation;
        this.memberList = memberList;
        this.currentMember = 0;
        this.totalSave = 0.0;
    }

    public void visit(Adult adult) {
        if (memberList.contains(adult)) currentMember++;
    }

    public void visit(Child child) {
        if (memberList.contains(child)) currentMember++;
    }

    public void visit(Senior senior) {
        if (memberList.contains(senior)) currentMember++;
    }

    public void visit(Infant infant) {
        if (memberList.contains(infant)) currentMember++;
    }

    public Double getTotalSave() {
        return totalSave;
    }

    public void calculateTotalSave(Double totalRegularPrice) {
        if (minMember > currentMember) return;
        totalSave = calculation.getSave(totalRegularPrice);
    }
}
