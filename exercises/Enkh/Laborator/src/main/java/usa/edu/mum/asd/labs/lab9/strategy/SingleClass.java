package usa.edu.mum.asd.labs.lab9.strategy;

import java.util.List;

public class SingleClass implements Model {

    @Override
    public Double getRevenue(List<Flight> flightList, double cost, double pricePerSeat) {
        Double ret = 0.0;
        for (Flight flight : flightList) {
            ret = ret + (flight.getTotalSeat() * pricePerSeat - cost);
        }
        return ret;
    }
}
