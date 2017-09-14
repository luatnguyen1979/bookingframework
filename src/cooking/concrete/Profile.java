/**
 * This the java source code of Cooking System @ MPP class, 2017
 */
package cooking.concrete;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Van Gia Luat Nguyen
 *
 */
final public class Profile {
	private String userID;
	private String name;
	private String email;
	private LocalDate dob;
	private boolean gender;
	private double height;
	private double weigth;
	private List<String> favFoods;
	private List<String> recipeIDList;
	private List<Address> addressesList;
	private User user;

	/**
	 * 
	 */
	private Profile() {	}
	
	/**
	 * 
	 * @param profileName
	 * @param name
	 * @param email
	 * @param dob
	 * @param gender
	 * @param height
	 * @param weight
	 * @param favFoods
	 * @param favFoodComponents
	 */
	Profile(String userID, String name, String email, LocalDate dob, boolean gender, double height, double weight, List<String> favFoods) {
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.height = height;
		this.weigth = weight;
		this.favFoods = favFoods;	
	}

	/**
	 * @return the userID
	 */
	public String getuserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setuserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	/**
	 * @return the gender
	 */
	public boolean isGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weigth
	 */
	public double getWeigth() {
		return weigth;
	}

	/**
	 * @param weigth the weigth to set
	 */
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	/**
	 * @return the favFoods
	 */
	public List<String> getFavFoods() {
		return favFoods;
	}

	/**
	 * @param favFoods the favFoods to set
	 */
	public void setFavFoods(List<String> favFoods) {
		this.favFoods = favFoods;
	}

	/**
	 * @return the recipeIDList
	 */
	public List<String> getRecipeIDList() {
		return recipeIDList;
	}

	/**
	 * @param recipeIDList the recipeIDList to set
	 */
	public void setRecipeIDList(List<String> recipeIDList) {
		this.recipeIDList = recipeIDList;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the addressesList
	 */
	public List<Address> getAddressesList() {
		return addressesList;
	}

	/**
	 * @param addressesList the addressesList to set
	 */
	public void setAddressesList(List<Address> addressesList) {
		this.addressesList = addressesList;
	}

	@Override
	public String toString() {
		return "\"------------ Profile data -----------\n Profile [userID=" + userID +
				"\n name=" + name + "\n email=" + email + "\n dob=" + dob +
				"\n gender=" + gender + "\n height=" + height + "\n weigth=" + weigth +
				"\n favFoods=" + favFoods + "\n recipeIDList=" + recipeIDList +
				"\n addressesList=" + addressesList + "\n user=" + user.getUserID() + "]";
	}

	
}
