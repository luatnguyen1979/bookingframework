package asd.booking.utils;

import asd.booking.dao.PromotionDAO;
import asd.booking.domain.trip.Passenger;
import asd.booking.domain.trip.Trip;

public class Calculation {

    private double getPrice(double regularPrice, PassengerType passengerType) {
        switch (passengerType) {
            case ADULT:
                return regularPrice;
            case CHILD:
                return regularPrice / 2;
            case SENIOR:
                return regularPrice * 85 / 100;
            case INFANT:
                return 0.0;
            default:
                return regularPrice;
        }
    }

    public double getFinalPrice(Trip trip, String promotionCode) {
        double regularPrice = trip.getRoute().getPriceOneWay();
        if (trip.getTripWay().equals("roundtrip")) regularPrice = trip.getRoute().getPriceRoundWay();
        double totalPrice = 0.0;
        for (Passenger passenger : trip.getPassengerList()) {
            totalPrice = totalPrice + getPrice(regularPrice, passenger.getPassengerType());
        }
        if (promotionCode != null) {
            double percent = PromotionDAO.getPercent(promotionCode);
            totalPrice = totalPrice - (totalPrice / 100 * percent);
        }
        return totalPrice;
    }
}
