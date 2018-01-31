package asd.booking.domain.promotion;

import asd.booking.domain.trip.Route;
import asd.booking.domain.trip.Trip;

public class DistanceCondition implements Condition {

    private Integer id;
    private String name;
    private int minDistance;

    public DistanceCondition(Integer id, String name, int minDistance) {
        this.id = id;
        this.name = name;
        this.minDistance = minDistance;
    }

    @Override
    public boolean match(Trip trip) {
        return trip.getRoute().getDistance() >= minDistance;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMinDistance() {
        return minDistance;
    }
}
