package asd.booking.domain.discount.calculation;

import asd.booking.utils.PassengerType;

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

    public double getFinalPrice(double regularPrice, PassengerType passengerType, String promotionCode) {
        double price = getPrice(regularPrice, passengerType);
        if (promotionCode != null) {
            //TODO check promotion by ENKH
        }
        return price;
    }

}
