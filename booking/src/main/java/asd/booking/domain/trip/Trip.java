package asd.booking.domain.trip;

import asd.booking.domain.discount.passenger.Passenger;

import java.time.LocalDate;
import java.util.List;

public class Trip {

    private Integer id;
    private boolean roundWay;
    private LocalDate departureDate;
    private LocalDate arrivelDate;
    private List<Passenger> passengerList;
    private LocalDate bookedDate;
    private Route route;

    public Trip(Integer id, boolean roundWay, LocalDate departureDate, LocalDate arrivelDate,
                List<Passenger> passengerList, LocalDate bookedDate, Route route) {
        this.id = id;
        this.roundWay = roundWay;
        this.departureDate = departureDate;
        this.arrivelDate = arrivelDate;
        this.passengerList = passengerList;
        this.bookedDate = bookedDate;
        this.route = route;
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

    public LocalDate getArrivelDate() {
        return arrivelDate;
    }

    public void setArrivelDate(LocalDate arrivelDate) {
        this.arrivelDate = arrivelDate;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Port getDeparturePort() {
        return route.getSource();
    }

    public Port getArrivalPort() {
        return route.getDestination();
    }

    public LocalDate getBookedDate() {
        return bookedDate;
    }

    public void setBookedDate(LocalDate bookedDate) {
        this.bookedDate = bookedDate;
    }

    public Integer getId() {
        return id;
    }
}
