package lesson12.strategyDesignpattern.strategy;

import java.util.List;

import lesson12.strategyDesignpattern.Flight;

public interface Model {
	
	int BASE_TICKET_PRICE = 3000;
	int FLIGHT_FIXED_COST_PRICE = 50000;
		
	public long getRevenue(List<Flight> flights);

}
