/**
 * 
 */
package asd.booking.domain;

/**
 * @author luatnguyen
 *
 */
public class User {

	private String userName;
	private String password;

	public boolean valid;

	/**
	 * 
	 */
	public User() {
	}
	
	/**
	 * 
	 */
	public User(User user) {
		this.userName = user.userName;
		this.password = user.password;
		this.valid = user.valid;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the valid
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * @param valid
	 *            the valid to set
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}

}
