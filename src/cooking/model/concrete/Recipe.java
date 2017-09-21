/**
 * This the java source code of Cooking System @ MPP class, 2017
 */
package cooking.model.concrete;

import java.util.UUID;
import java.util.*;

/**
 * @author Van Gia Luat Nguyen
 *
 */
public class Recipe {
	private String recipeID;
	private String name;
	private String description;
	private String cookingSteps;
	private List<String> ingredient;
	private String image;
	private String categoryID;
	private NutritionFact nutritionFact;
	
	/**
	 * @return the nutritionFact
	 */
	public NutritionFact getNutritionFact() {
		return nutritionFact;
	}


	/**
	 * @param nutritionFact the nutritionFact to set
	 */
	public void setNutritionFact(NutritionFact nutritionFact) {
		this.nutritionFact = nutritionFact;
	}


	public Recipe() {}
	

	/**
	 * 
	 */
	public Recipe(String name, String description, String cookingSteps, String image, String categoryID) {
		this.recipeID = UUID.randomUUID().toString();
		this.name = name;
		this.description = description;
		this.cookingSteps = cookingSteps;
		this.image = image;
		this.categoryID = categoryID;
		this.ingredient = new ArrayList<String>();
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


		/**
		 * @return the image
		 */
		public String getImage() {
			return image;
		}


		/**
		 * @param image the image to set
		 */
		public void setImage(String image) {
			this.image = image;
		}


		/**
		 * @return the ingredient
		 */
		public List<String> getIngredient() {
			return ingredient;
		}


		/**
		 * @param ingredient the ingredient to set
		 */
		public void setIngredient(List<String> ingredient) {
			this.ingredient = ingredient;
		}
		
		

}
