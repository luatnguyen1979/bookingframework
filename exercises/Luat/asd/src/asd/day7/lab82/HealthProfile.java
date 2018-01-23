/**
 * 
 */
package asd.day7.lab82;

/**
 * @author luatnguyen
 *
 */
public class HealthProfile {
	private String profileName;

	/**
	 * @param profileName
	 */
	public HealthProfile(String profileName) {
		super();
		this.profileName = profileName;
	}

	/**
	 * @return the profileName
	 */
	public String getProfileName() {
		return profileName;
	}

	/**
	 * @param profileName
	 *            the profileName to set
	 */
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	@Override
	public String toString() {
		return "[HealProfile profileName=" + profileName + "]";
	}
}
