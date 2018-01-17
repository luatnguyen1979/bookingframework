package lesson12.strategyDesignpattern;

import java.util.ArrayList;
import java.util.List;

import lesson12.strategyDesignpattern.strategy.Model;

public class AirLinesCompany  {

	// List of Flights
	public List<Flight> flights;

	public AirLinesCompany() {
		this.flights = new ArrayList<>();
	}

	public void addFlight(Flight item) {
		this.flights.add(item);
	}

	public void removeFlight(Flight item) {
		this.flights.remove(item);
	}

	public long getRevenue(Model revenueModel) {
		
		return revenueModel.getRevenue(flights);
	}

}
