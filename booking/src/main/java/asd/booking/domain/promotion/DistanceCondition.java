package asd.booking.domain.promotion;

import asd.booking.domain.trip.Route;
import asd.booking.domain.trip.Trip;

public class DistanceCondition implements Condition {

    private int minDistance;

    @Override
    public boolean match(Trip trip) {
        int totalDistance = 0;
        for (Route route : trip.getPrice().getRoutes()) {
            totalDistance += route.getDistance();
        }
        return totalDistance >= minDistance;
    }
}
