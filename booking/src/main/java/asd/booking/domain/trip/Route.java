package asd.booking.domain.trip;

public class Route {

    private Integer id;
    private Port source;
    private Port destination;
    private Integer duration;
    private Double distance;
    private Double priceOneWay;
    private Double priceRoundWay;

    public Route(Integer id, Port source, Port destination, Integer duration, Double distance,
                 Double priceOneWay, Double priceRoundWay) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.duration = duration;
        this.distance = distance;
        this.priceOneWay = priceOneWay;
        this.priceRoundWay = priceRoundWay;
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPriceOneWay() {
        return priceOneWay;
    }

    public void setPriceOneWay(Double priceOneWay) {
        this.priceOneWay = priceOneWay;
    }

    public Double getPriceRoundWay() {
        return priceRoundWay;
    }

    public void setPriceRoundWay(Double priceRoundWay) {
        this.priceRoundWay = priceRoundWay;
    }
}
