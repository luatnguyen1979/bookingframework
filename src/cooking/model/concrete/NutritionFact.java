/**
 * This the java source code of Cooking System @ MPP class, 2017
 */
package cooking.model.concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import cooking.model.concrete.interfaces.IUnit;

/**
 * @author Van Gia Luat Nguyen
 *
 */
public class NutritionFact implements IUnit {
	
	private String nutritionFactID;
	private String foodComponentID;
	private String unitID;
	private String nutritionID;
	private double quantity;

	/**
	 * 
	 */
	public NutritionFact(String foodComponentID, String unitID, String nutritionID, double quantity) {
		this.nutritionFactID = UUID.randomUUID().toString();
		this.foodComponentID = foodComponentID;
		this.unitID = unitID;
		this.nutritionID = nutritionID;
		this.quantity = quantity;
		
	}

	/**
	 * @return the nutritionFactID
	 */
	public String getFoodComponentID() {
		return foodComponentID;
	}

	/**
	 * @param nutritionFactID the nutritionFactID to set
	 */
	public void setNutritionFactID(String nutritionFactID) {
		this.foodComponentID = nutritionFactID;
	}

	/**
	 * @return the unitID
	 */
	public String getUnitID() {
		return unitID;
	}

	/**
	 * @param unitID the unitID to set
	 */
	public void setUnitID(String unitID) {
		this.unitID = unitID;
	}

	/**
	 * @return the name
	 */
	public String getNutritionID() {
		return nutritionID;
	}

	/**
	 * @param name the name to set
	 */
	public void setNutritionID(String name) {
		this.nutritionID = name;
	}

	/**
	 * @return the quantity
	 */
	public double getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public List<Unit> getUnitsList() {
		
		return new ArrayList<Unit>();
	}

}
