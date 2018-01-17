package lesson12.strategyDesignpattern.concreteStrategy;

import java.util.List;

import lesson12.strategyDesignpattern.Flight;
import lesson12.strategyDesignpattern.strategy.Model;

public class MultiClasses implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {

		int revenue = 0;

		for (Flight flight : flights) {

			float firstClassRevenue = (float) ((flight.getFlightSeat() / 0.1) * (BASE_TICKET_PRICE * 4));
			float businessRevenue = (float) ((flight.getFlightSeat() / 0.2) * (BASE_TICKET_PRICE * 1.5));
			float coachRevenue = (float) ((flight.getFlightSeat() / 0.7) * (BASE_TICKET_PRICE * 0.75));

			float flightRevenue = (float) (firstClassRevenue + businessRevenue + coachRevenue - FLIGHT_FIXED_COST_PRICE *1.2);

			revenue += flightRevenue;
		}
		return revenue;
	}


}
