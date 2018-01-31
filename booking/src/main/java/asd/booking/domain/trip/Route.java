package asd.booking.domain.trip;

public class Route {

    private int id;
    private Port source;
    private Port destination;
    private double duration;
    private double distance;
    private double priceOneWay;
    private double priceRoundWay;

    public Route() {
    }

    public Route(int id, Port source, Port destination, double duration, double distance, double priceOneWay, double priceRoundWay) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.duration = duration;
        this.distance = distance;
        this.priceOneWay = priceOneWay;
        this.priceRoundWay = priceRoundWay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Port getSource() {
        return source;
    }

    public void setSource(Port source) {
        this.source = source;
    }

    public Port getDestination() {
        return destination;
    }

    public void setDestination(Port destination) {
        this.destination = destination;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getPriceOneWay() {
        return priceOneWay;
    }

    public void setPriceOneWay(double priceOneWay) {
        this.priceOneWay = priceOneWay;
    }

    public double getPriceRoundWay() {
        return priceRoundWay;
    }

    public void setPriceRoundWay(double priceRoundWay) {
        this.priceRoundWay = priceRoundWay;
    }
}
