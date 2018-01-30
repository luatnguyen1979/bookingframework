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
    private Price price;
    private LocalDate bookedDate;

    public Trip(Integer id, boolean roundWay, LocalDate departureDate, LocalDate arrivelDate,
                List<Passenger> passengerList, Price price, LocalDate bookedDate) {
        this.id = id;
        this.roundWay = roundWay;
        this.departureDate = departureDate;
        this.arrivelDate = arrivelDate;
        this.passengerList = passengerList;
        this.price = price;
        this.bookedDate = bookedDate;
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

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Port getDeparturePort() {
        return price.getRoutes().get(0).getSource();
    }

    public Port getArrivalPort() {
        return price.getRoutes().get(price.getRoutes().size() - 1).getDestination();
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
