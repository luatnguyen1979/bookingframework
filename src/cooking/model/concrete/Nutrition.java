/**
 * This the java source code of Cooking System @ MPP class, 2017
 */
package cooking.model.concrete;

import java.util.UUID;

/**
 * @author Van Gia Luat Nguyen
 *
 */
public class Nutrition {
	private String nutritionID;
	private String name;
	private String description;
	
	

	public Nutrition() {

	}

	/**
	 * 
	 */
	public Nutrition(String name, String description) {
		this.nutritionID = UUID.randomUUID().toString();
		this.name = name;
				this.description = description;
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
	 * @return the nutritionID
	 */
	public String getNutritionID() {
		return nutritionID;
	}
	
	

}
