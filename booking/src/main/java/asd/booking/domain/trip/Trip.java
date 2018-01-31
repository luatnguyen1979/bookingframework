package asd.booking.domain.trip;

import asd.booking.domain.Customer;
import asd.booking.domain.Train;
import asd.booking.domain.discount.passenger.Passenger;

import java.time.LocalDate;
import java.util.List;

public class Trip {

    private int id;
    private boolean roundWay;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private List<Passenger> passengerList;
    private LocalDate bookedDate;
    private Customer booker;
    private Route route;
    private Train train;

    public Trip(int id, boolean roundWay, LocalDate departureDate, LocalDate arrivalDate, List<Passenger> passengerList,
                LocalDate bookedDate, Customer booker, Route route, Train train) {
        this.id = id;
        this.roundWay = roundWay;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.passengerList = passengerList;
        this.bookedDate = bookedDate;
        this.booker = booker;
        this.route = route;
        this.train = train;
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

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
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

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
