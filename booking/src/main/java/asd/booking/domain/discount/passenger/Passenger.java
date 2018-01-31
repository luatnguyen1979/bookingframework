package asd.booking.domain.discount.passenger;

import asd.booking.utils.PassengerType;

public class Passenger {

    private Integer id;
    private String fullname;
    private PassengerType passengerType;

    public Passenger(Integer id, String fullname, PassengerType passengerType) {
        this.id = id;
        this.fullname = fullname;
        this.passengerType = passengerType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }
}
