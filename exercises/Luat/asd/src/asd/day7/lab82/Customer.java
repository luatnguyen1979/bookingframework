/**
 * 
 */
package asd.day7.lab82;

/**
 * @author luatnguyen
 *
 */
public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;
	private Address residenceAddress;
	private HealthProfile profile;
	// city map with a red dot representing residence location
	private Image locationMap;

	/**
	 * @param customerId
	 * @param firstName
	 * @param lastName
	 * @param residenceAddress
	 * @param profile
	 * @param locationMap
	 */
	public Customer(int customerId, String firstName, String lastName) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the residenceAddress
	 */
	public Address getResidenceAddress() {
		return residenceAddress;
	}

	/**
	 * @param residenceAddress
	 *            the residenceAddress to set
	 */
	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	/**
	 * @return the profile
	 */
	public HealthProfile getProfile() {
		return profile;
	}

	/**
	 * @param profile
	 *            the profile to set
	 */
	public void setProfile(HealthProfile profile) {
		this.profile = profile;
	}

	/**
	 * @return the locationMap
	 */
	public Image getLocationMap() {
		return locationMap;
	}

	/**
	 * @param locationMap
	 *            the locationMap to set
	 */
	public void setLocationMap(Image locationMap) {
		this.locationMap = locationMap;
	}

	@Override
	public String toString() {
		return "[Customer customerId=" + this.customerId + " firstName=" + this.firstName + " lastName=" + this.lastName
				+ " residenceAddress=" + this.residenceAddress.toString() + " profile=" + this.profile.toString()
				+ "locationMap=" + this.locationMap.toString() + "]";
	}
}
