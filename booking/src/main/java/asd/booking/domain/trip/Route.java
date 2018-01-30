package asd.booking.domain.trip;

public class Route {

    private Port source;
    private Port destination;
    private Integer duration;
    private Double distance;

    public Route(Port source, Port destination, Integer duration, Double distance) {
        this.source = source;
        this.destination = destination;
        this.duration = duration;
        this.distance = distance;
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
}
