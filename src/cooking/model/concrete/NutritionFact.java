/**
 * This the java source code of Cooking System @ MPP class, 2017
 */
package cooking.model.concrete;

/**
 * @author Van Gia Luat Nguyen
 *
 */
public class NutritionFact {
	
	public NutritionFact() {

	}
	
//	private String recipeID;
	private String amountPer;
	private String calories;
	private String totalFat;
	private String saturatedfat;
	private String polyunsaturatedfat;
	private String monounsaturatedfat;
	private String transfat;
	private String cholesterol;
	private String sodium;
	private String potassium;
	private String totalCarbohydrate;
	private String dietaryFiber;
	private String sugar;
	private String protein;
	private String vitaminA;
	private String vitaminC;
	private String calcium;
	private String iron;
	private String vitaminD;
	private String vitaminB6;
	private String vitaminB12;
	private String magnesium;
	/**
	 * @return the recipeID
	 */
	/*public String getRecipeID() {
		return recipeID;
	}
	*//**
	 * @param recipeID the recipeID to set
	 *//*
	public void setRecipeID(String recipeID) {
		this.recipeID = recipeID;
	}*/
	/**
	 * @return the amountPer
	 */
	public String getAmountPer() {
		return amountPer;
	}
	/**
	 * @param amountPer the amountPer to set
	 */
	public void setAmountPer(String amountPer) {
		this.amountPer = amountPer;
	}
	/**
	 * @return the calories
	 */
	public String getCalories() {
		return calories;
	}
	/**
	 * @param calories the calories to set
	 */
	public void setCalories(String calories) {
		this.calories = calories;
	}
	/**
	 * @return the totalFat
	 */
	public String getTotalFat() {
		return totalFat;
	}
	/**
	 * @param totalFat the totalFat to set
	 */
	public void setTotalFat(String totalFat) {
		this.totalFat = totalFat;
	}
	/**
	 * @return the saturatedfat
	 */
	public String getSaturatedfat() {
		return saturatedfat;
	}
	/**
	 * @param saturatedfat the saturatedfat to set
	 */
	public void setSaturatedfat(String saturatedfat) {
		this.saturatedfat = saturatedfat;
	}
	/**
	 * @return the polyunsaturatedfat
	 */
	public String getPolyunsaturatedfat() {
		return polyunsaturatedfat;
	}
	/**
	 * @param polyunsaturatedfat the polyunsaturatedfat to set
	 */
	public void setPolyunsaturatedfat(String polyunsaturatedfat) {
		this.polyunsaturatedfat = polyunsaturatedfat;
	}
	/**
	 * @return the monounsaturatedfat
	 */
	public String getMonounsaturatedfat() {
		return monounsaturatedfat;
	}
	/**
	 * @param monounsaturatedfat the monounsaturatedfat to set
	 */
	public void setMonounsaturatedfat(String monounsaturatedfat) {
		this.monounsaturatedfat = monounsaturatedfat;
	}
	/**
	 * @return the transfat
	 */
	public String getTransfat() {
		return transfat;
	}
	/**
	 * @param transfat the transfat to set
	 */
	public void setTransfat(String transfat) {
		this.transfat = transfat;
	}
	/**
	 * @return the cholesterol
	 */
	public String getCholesterol() {
		return cholesterol;
	}
	/**
	 * @param cholesterol the cholesterol to set
	 */
	public void setCholesterol(String cholesterol) {
		this.cholesterol = cholesterol;
	}
	/**
	 * @return the sodium
	 */
	public String getSodium() {
		return sodium;
	}
	/**
	 * @param sodium the sodium to set
	 */
	public void setSodium(String sodium) {
		this.sodium = sodium;
	}
	/**
	 * @return the potassium
	 */
	public String getPotassium() {
		return potassium;
	}
	/**
	 * @param potassium the potassium to set
	 */
	public void setPotassium(String potassium) {
		this.potassium = potassium;
	}
	/**
	 * @return the totalCarbohydrate
	 */
	public String getTotalCarbohydrate() {
		return totalCarbohydrate;
	}
	/**
	 * @param totalCarbohydrate the totalCarbohydrate to set
	 */
	public void setTotalCarbohydrate(String totalCarbohydrate) {
		this.totalCarbohydrate = totalCarbohydrate;
	}
	/**
	 * @return the dietaryFiber
	 */
	public String getDietaryFiber() {
		return dietaryFiber;
	}
	/**
	 * @param dietaryFiber the dietaryFiber to set
	 */
	public void setDietaryFiber(String dietaryFiber) {
		this.dietaryFiber = dietaryFiber;
	}
	/**
	 * @return the sugar
	 */
	public String getSugar() {
		return sugar;
	}
	/**
	 * @param sugar the sugar to set
	 */
	public void setSugar(String sugar) {
		this.sugar = sugar;
	}
	/**
	 * @return the protein
	 */
	public String getProtein() {
		return protein;
	}
	/**
	 * @param protein the protein to set
	 */
	public void setProtein(String protein) {
		this.protein = protein;
	}
	/**
	 * @return the vitaminA
	 */
	public String getVitaminA() {
		return vitaminA;
	}
	/**
	 * @param vitaminA the vitaminA to set
	 */
	public void setVitaminA(String vitaminA) {
		this.vitaminA = vitaminA;
	}
	/**
	 * @return the vitaminC
	 */
	public String getVitaminC() {
		return vitaminC;
	}
	/**
	 * @param vitaminC the vitaminC to set
	 */
	public void setVitaminC(String vitaminC) {
		this.vitaminC = vitaminC;
	}
	/**
	 * @return the calcium
	 */
	public String getCalcium() {
		return calcium;
	}
	/**
	 * @param calcium the calcium to set
	 */
	public void setCalcium(String calcium) {
		this.calcium = calcium;
	}
	/**
	 * @return the iron
	 */
	public String getIron() {
		return iron;
	}
	/**
	 * @param iron the iron to set
	 */
	public void setIron(String iron) {
		this.iron = iron;
	}
	/**
	 * @return the vitaminD
	 */
	public String getVitaminD() {
		return vitaminD;
	}
	/**
	 * @param vitaminD the vitaminD to set
	 */
	public void setVitaminD(String vitaminD) {
		this.vitaminD = vitaminD;
	}
	/**
	 * @return the vitaminB6
	 */
	public String getVitaminB6() {
		return vitaminB6;
	}
	/**
	 * @param vitaminB6 the vitaminB6 to set
	 */
	public void setVitaminB6(String vitaminB6) {
		this.vitaminB6 = vitaminB6;
	}
	/**
	 * @return the vitaminB12
	 */
	public String getVitaminB12() {
		return vitaminB12;
	}
	/**
	 * @param vitaminB12 the vitaminB12 to set
	 */
	public void setVitaminB12(String vitaminB12) {
		this.vitaminB12 = vitaminB12;
	}
	/**
	 * @return the magnesium
	 */
	public String getMagnesium() {
		return magnesium;
	}
	/**
	 * @param magnesium the magnesium to set
	 */
	public void setMagnesium(String magnesium) {
		this.magnesium = magnesium;
	}
	
	

	
}
