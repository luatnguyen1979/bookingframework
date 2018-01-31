/**
 * 
 */
package asd.booking.domain;

import java.io.Serializable;

/**
 * @author luatnguyen
 *
 */
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8241943357544065394L;
	private int userId;
	private String userName;
	private String password;

	public boolean valid;

	/**
	 * 
	 */
	public User() {
	}
	
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
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

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	
}
