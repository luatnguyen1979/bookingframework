package asd.booking.domain.trip;

import asd.booking.domain.Customer;
import asd.booking.domain.discount.passenger.Passenger;

import java.time.LocalDate;
import java.util.List;

public class Trip {

    private int id;
    private boolean roundWay;
    private List<Passenger> passengerList;
    private LocalDate bookedDate;
    private Customer booker;
    private Route route;

    public Trip() {
    }

    public Trip(int id, boolean roundWay, List<Passenger> passengerList, LocalDate bookedDate, Customer booker,
                Route route) {
        this.id = id;
        this.roundWay = roundWay;
        this.passengerList = passengerList;
        this.bookedDate = bookedDate;
        this.booker = booker;
        this.route = route;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRoundWay() {
        return roundWay;
    }

    public void setRoundWay(boolean roundWay) {
        this.roundWay = roundWay;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public LocalDate getBookedDate() {
        return bookedDate;
    }

    public void setBookedDate(LocalDate bookedDate) {
        this.bookedDate = bookedDate;
    }

    public Customer getBooker() {
        return booker;
    }

    public void setBooker(Customer booker) {
        this.booker = booker;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
