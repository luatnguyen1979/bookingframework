package cooking.concrete;

public final class UserAndProfile implements IUserAndProfile {

	private User u;
	private Profile p;
	
	
	public UserAndProfile(User u, Profile p) {
		super();
		this.u = u;
		this.p = p;
	}

	@Override
	public User getUser() {
		return u;
	}

	@Override
	public Profile getProfile() {
		return p;
	}
	
	@Override
	public String toString() {
		return (this.u.toString() + this.p.toString());
	}

}
