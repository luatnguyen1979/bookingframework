package asd.booking.domain.trip;

import asd.booking.domain.Customer;

import java.time.LocalDate;
import java.util.List;

public class Trip {

	private int id;
	private String tripWay;
	private List<Passenger> passengerList;
	private String bookedDate;
	private Customer booker;
	private Route route;
	private String confirmationNumber;

	public Trip() {
	}

	public Trip(int id, String tripWay, List<Passenger> passengerList, String bookedDate, Customer booker,
			Route route, String confirmationNumber) {
		this.id = id;
		this.tripWay = tripWay;
		this.passengerList = passengerList;
		this.bookedDate = bookedDate;
		this.booker = booker;
		this.route = route;
		this.confirmationNumber = confirmationNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the tripWay
	 */
	public String getTripWay() {
		return tripWay;
	}

	/**
	 * @param tripWay
	 *            the tripWay to set
	 */
	public void setTripWay(String tripWay) {
		this.tripWay = tripWay;
	}

	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	public String getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(String bookedDate) {
		this.bookedDate = bookedDate;
	}

	public Customer getBooker() {
		return booker;
	}

	public void setBooker(Customer booker) {
		this.booker = booker;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	/**
	 * @return the confirmationNumber
	 */
	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	/**
	 * @param confirmationNumber the confirmationNumber to set
	 */
	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	
	
}
