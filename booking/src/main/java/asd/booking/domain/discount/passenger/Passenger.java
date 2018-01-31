package asd.booking.domain.discount.passenger;

import asd.booking.controller.discount.IPrice;
import asd.booking.domain.discount.calculation.Calculation;
import asd.booking.utils.PassengerType;

public class Passenger implements IPrice {

    private Integer id;
    private Calculation calculation;
    private String name;
    private String description;
    private PassengerType passengerType;

    public Passenger(Integer id, Calculation calculation, String name, String description, PassengerType passengerType) {
        this.id = id;
        this.calculation = calculation;
        this.name = name;
        this.description = description;
        this.passengerType = passengerType;

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

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    @Override
    public double getPrice(Double regularPrice) {
        return calculation.calculate(regularPrice);
    }
}
