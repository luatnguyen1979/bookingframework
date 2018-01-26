package usa.edu.mum.asd.labs.lab9.strategy;

import java.util.List;

public class MultiClasses implements Model {

    @Override
    public Double getRevenue(List<Flight> flightList, double cost, double pricePerSeat) {
        Double ret = 0.0;
        for (Flight flight : flightList) {
            ret = ret + (flight.getTotalSeat() / 10 * (pricePerSeat * 4));
            ret = ret + (flight.getTotalSeat() / 10 * 2 * (pricePerSeat * 1.5));
            ret = ret + (flight.getTotalSeat() / 10 * 7 * (pricePerSeat * 0.75));
            ret = ret - (cost * 1.2);
        }
        return ret;
    }
}

