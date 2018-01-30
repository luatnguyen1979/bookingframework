package asd.booking.domain.discount.passenger;

import asd.booking.domain.discount.Discount;
import asd.booking.domain.discount.DiscountVisitor;
import asd.booking.domain.discount.calculation.Calculation;

public class Passenger {

    private Calculation calculation;
    private String name;
    private String description;
    private byte fromAge;
    private byte toAge;

    public Passenger(Calculation calculation, String name, String description, byte fromAge, byte toAge) {
        this.calculation = calculation;
        this.name = name;
        this.description = description;
        this.fromAge = fromAge;
        this.toAge = toAge;
    }

    public Calculation getCalculation() {
        return calculation;
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getFromAge() {
        return fromAge;
    }

    public void setFromAge(byte fromAge) {
        this.fromAge = fromAge;
    }

    public byte getToAge() {
        return toAge;
    }

    public void setToAge(byte toAge) {
        this.toAge = toAge;
    }
}
