package asd.booking.domain.trip;

public class Passenger {

	private Integer id;
	private String fullname;
	private String passengerType;
	private int tripId;
	private double price;

	public Passenger(String fullname, String passengerType, double price, int tripId) {
		this.fullname = fullname;
		this.passengerType = passengerType;
		this.tripId = tripId;
		this.price = price;
	}

	public Passenger(Integer id, String fullname, String passengerType, int tripId) {
		this.id = id;
		this.fullname = fullname;
		this.passengerType = passengerType;
		this.tripId = tripId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	/**
	 * @return the tripId
	 */
	public int getTripId() {
		return tripId;
	}

	/**
	 * @param tripId
	 *            the tripId to set
	 */
	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
