package cooking.concrete;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class FactoryClass {

	private FactoryClass() {	}

	public static IUserAndProfile createUserAndProfile(String userID, String userName, String password, String role,
			String name, String email, LocalDate dob, boolean gender, double height, double weight, List<String> favFoods) {

		LocalDate d = LocalDate.of(2014, 5, 10);
		List<String> favFood = new ArrayList<String>();

		User u = new User(userID, userName, password, role);
		Profile p = new Profile(userID, name, email, d, gender, height, weight, favFood);
		u.setProfile(p);
		p.setUser(u);
		p.setuserID(u.getUserID());
		return new UserAndProfile(u, p);
	}
	
}
