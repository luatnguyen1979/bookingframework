/**
 * 
 */
package asd.day7.lab82;

/**
 * @author luatnguyen
 *
 */
public class Address {
	private String street;
	private String city;
	private String state;
	private String zipcode;

	/**
	 * @param streetAddress
	 * @param city
	 * @param state
	 * @param zipcode
	 */
	public Address(String streetAddress, String city, String state, String zipcode) {
		super();
		this.street = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param streetAddress
	 *            the streetAddress to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode
	 *            the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "[Address street=" + this.street + " city=" + this.city + " state=" + this.state + " zipcode="
				+ this.zipcode + "]";
	}
}
