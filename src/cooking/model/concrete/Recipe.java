/**
 * This the java source code of Cooking System @ MPP class, 2017
 */
package cooking.model.concrete;

import java.util.UUID;

/**
 * @author Van Gia Luat Nguyen
 *
 */
public class Recipe {
	private String recipeID;
	private String name;
	private String description;
	private String cookingSteps;
	private String categoryID;
	
	public Recipe() {}
	

	/**
	 * 
	 */
	public Recipe(String name, String description, String cookingSteps, String categoryID) {
		this.recipeID = UUID.randomUUID().toString();
		this.name = name;
		this.description = description;
		this.cookingSteps = cookingSteps;
		this.categoryID = categoryID;
	}

	/**
	 * @return the recipeID
	 */
	public String getRecipeID() {
		return recipeID;
	}

	/**
	 * @param recipeID the recipeID to set
	 */
	public void setRecipeID(String recipeID) {
		this.recipeID = recipeID;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the cookingSteps
	 */
	public String getCookingSteps() {
		return cookingSteps;
	}

	/**
	 * @param cookingSteps the cookingSteps to set
	 */
	public void setCookingSteps(String cookingSteps) {
		this.cookingSteps = cookingSteps;
	}

	/**
	 * @return the categoryID
	 */
	public String getCategoryID() {
		return categoryID;
	}

	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	
	 private int no;


		/**
		 * @return the no
		 */
		public int getNo() {
			return no;
		}

		/**
		 * @param no the no to set
		 */
		public void setNo(int no) {
			this.no = no;
		}

}
