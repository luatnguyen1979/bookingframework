/**
 * This the java source code of Cooking System @ MPP class, 2017
 */
package cooking.model.concrete;

import cooking.model.concrete.IUserAndProfile;
import cooking.model.concrete.Profile;
import cooking.model.concrete.User;

/**
 * @author Van Gia Luat Nguyen
 *
 */
public class UserAndProfileImpl implements IUserAndProfile {

	private User user;
	private Profile profile;

	/**
	 * 
	 */
	/*
	 * private UserAndProfileImpl() {
	 * 
	 * }
	 */

	/**
	 * 
	 * @param user
	 * @param profile
	 */
	UserAndProfileImpl(User user, Profile profile) {
		this.user = user;
		this.profile = profile;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @return the profile
	 */
	public Profile getProfile() {
		return profile;
	}

	@Override
	public String toString() {
		return (this.user.toString() + this.profile.toString());
	}

}
