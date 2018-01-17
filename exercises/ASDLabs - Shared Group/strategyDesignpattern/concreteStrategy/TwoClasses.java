package lesson12.strategyDesignpattern.concreteStrategy;

import java.util.List;

import lesson12.strategyDesignpattern.Flight;
import lesson12.strategyDesignpattern.strategy.Model;

public class TwoClasses implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {

		int revenue = 0;

		for (Flight flight : flights) {

			float businessRevenue = (float) ((flight.getFlightSeat() / 0.33) * (BASE_TICKET_PRICE * 1.5));
			float coachRevenue = (float) ((flight.getFlightSeat() / 0.667) * (BASE_TICKET_PRICE * 0.75));

			float flightRevenue = (float) (businessRevenue + coachRevenue - FLIGHT_FIXED_COST_PRICE *1.1);

			revenue += flightRevenue;
		}
		return revenue;
	}

}
