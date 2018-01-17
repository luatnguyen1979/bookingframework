package lesson12.strategyDesignpattern;

public class Flight {
	
	private String FlightNumber;
	private String FlightName;
	private int FlightSeat;
	public long flightRevenue;
	
	
	public Flight(String flightNumber, String flightName, int flightSeat) {
		super();
		FlightNumber = flightNumber;
		FlightName = flightName;
		FlightSeat = flightSeat;
	}
	
	
	public String getFlightNumber() {
		return FlightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		FlightNumber = flightNumber;
	}
	public String getFlightName() {
		return FlightName;
	}
	public void setFlightName(String flightName) {
		FlightName = flightName;
	}
	public int getFlightSeat() {
		return FlightSeat;
	}
	public void setFlightSeat(int flightSeat) {
		FlightSeat = flightSeat;
	}
	
	public float getRevenue(){
		return flightRevenue;
	}
}
