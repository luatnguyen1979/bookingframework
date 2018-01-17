package lesson12.strategyDesignpattern.concreteStrategy;

import java.util.List;

import lesson12.strategyDesignpattern.Flight;
import lesson12.strategyDesignpattern.strategy.Model;

public class SinglePrices implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		
		int revenue = 0;
		
		for(Flight flight : flights){
			
			int flightRevenue =  flight.getFlightSeat() * BASE_TICKET_PRICE - FLIGHT_FIXED_COST_PRICE;
			
			revenue += flightRevenue;
		}
		return revenue;
	}

}
