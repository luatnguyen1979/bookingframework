package usa.edu.mum.asd.labs.lab9.strategy;

import java.util.List;

public interface Model {

    public Double getRevenue(List<Flight> flightList, double cost, double pricePerSeat);
}
