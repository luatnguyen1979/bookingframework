package cooking.model.concrete;

import java.io.File;
import java.util.List;
import java.util.UUID;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String uniqueID = UUID.randomUUID().toString();
		System.out.println(uniqueID);
		uniqueID = UUID.randomUUID().toString();
		System.out.println(uniqueID);
		uniqueID = UUID.randomUUID().toString();
		System.out.println(uniqueID);
		uniqueID = UUID.randomUUID().toString();
		System.out.println(uniqueID);
		uniqueID = UUID.randomUUID().toString();
		System.out.println(uniqueID);
		uniqueID = UUID.randomUUID().toString();
		System.out.println(uniqueID);
		uniqueID = UUID.randomUUID().toString();
		System.out.println(uniqueID);
		uniqueID = UUID.randomUUID().toString();
		System.out.println(uniqueID);
		uniqueID = UUID.randomUUID().toString();
		System.out.println(uniqueID);*/
		String uniqueID = UUID.randomUUID().toString();
		System.out.println(uniqueID);
		uniqueID = UUID.randomUUID().toString();
		System.out.println(uniqueID);
		uniqueID = UUID.randomUUID().toString();
		System.out.println(uniqueID);
		
		
		//System.out.println(new File("src/data/address.json").getAbsolutePath());
		
		List<Address> address = ObjectUtilities.loadAddressData();
		List<Category> categories = ObjectUtilities.loadCategoryData();
		List<FoodComponent> foodComponent = ObjectUtilities.loadFoodComponentData();
		List<Nutrition> nutrition = ObjectUtilities.loadNutritionData();
		List<NutritionFact> nutritionFact = ObjectUtilities.loadNutritionFactData();
		List<Profile> profile = ObjectUtilities.loadProfileData();
		List<Recipe> recipe = ObjectUtilities.loadRecipeData();
		List<Unit> unit = ObjectUtilities.loadUnitData();
		List<User> user = ObjectUtilities.loadUserData();
		
		
		/*Category category = categories.get(0);
		categories.add(category);*/
		//categories.remove(0);
		
		//ObjectUtilities.saveCategoryData(categories);
		//List<Category> category = CookingObjectFactory.loadCategoryData();
		//List<Recipe> recipe = CookingObjectFactory.loadRecipeData();
		//System.out.println(recipe);
	}

}
