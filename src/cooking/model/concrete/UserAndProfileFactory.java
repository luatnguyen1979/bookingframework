package cooking.model.concrete;

import java.time.LocalDate;
import java.util.List;

public final class UserAndProfileFactory {

	private UserAndProfileFactory() {
		// TODO Auto-generated constructor stub
	}

	public static IUserAndProfile createUserAndProfile(String userID, String userName, String password, String role,
			String name, String email, String dob, String gender, double height, double weight,
			List<String> favFoods) {

		

		User user = new User(userID, userName, password, role);
		Profile profile = new Profile(name, email, dob, gender, height, weight);
		user.setProfile(profile);
		profile.setUser(user);

		return new UserAndProfileImpl(user, profile);
	}

}
