package asd.booking.domain.promotion;

import asd.booking.domain.trip.Trip;

public interface Condition {

    public boolean match(Trip trip);
}
