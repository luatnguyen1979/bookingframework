package asd.booking.domain.trip;

import asd.booking.utils.PassengerType;

public class Passenger {

    private Integer id;
    private String fullname;
    private PassengerType passengerType;
    private Trip trip;

    public Passenger(String fullname, PassengerType passengerType, Trip trip) {
        this.fullname = fullname;
        this.passengerType = passengerType;
        this.trip = trip;
    }

    public Passenger(Integer id, String fullname, PassengerType passengerType, Trip trip) {
        this.id = id;
        this.fullname = fullname;
        this.passengerType = passengerType;
        this.trip = trip;
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

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
