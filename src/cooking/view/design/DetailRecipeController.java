/**
 * This the java source code of Cooking System @ MPP class, 2017
 */
package cooking.view.design;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import cooking.model.concrete.Category;
import cooking.model.concrete.ObjectUtilities;
import cooking.model.concrete.Recipe;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
/**
 * @author Van Gia Luat Nguyen
 *
 */
public class DetailRecipeController {
	
	private ObservableList<Category> categoryData = FXCollections.observableArrayList();
	
	@FXML
	private ImageView imageView;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private TextArea txtDescription;
	
	@FXML
	private TextField txtIngName;
	
	@FXML
	private ComboBox cboCategory;
	
	@FXML
	private TextField txtNutrifact;
	
	@FXML
	private ListView listIngr;
	
	@FXML
	private ListView listNutrifact;
	
	@FXML
	private ComboBox cboNutrifact;
	

	
	private String imagePath;
	
	private boolean isUpdate = false;
	
	private String modifyingID = "";
	


	/**
	 * 
	 */
	public DetailRecipeController() {
		// TODO Auto-generated constructor stub
	}
	
	@FXML
	private void handleCancelRecipe() {
		try {
            // Load the fxml file and set into the center of the main layout
    		
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("MainApp.fxml"));
            AnchorPane pane = (AnchorPane) loader.load();
            MainApp.rootLayout.setCenter(pane);
 

        } catch (IOException e) {
            // Exception gets thrown if the fxml file could not be loaded
            e.printStackTrace();
        }
	}
	
	@FXML
	private void handleSelectImage() {

    		
			final FileChooser fileChooser = new FileChooser();
			fileChooser.setInitialDirectory(new File("C:\\Users\\duke\\Google Drive\\eclipse-workspace\\CookingSystem\\trunk\\src\\images"));
			
			//fileChooser.getExtensionFilters().addAll(new ExtensionFilter("PNG Files", "*.png"));
			fileChooser.getExtensionFilters().addAll(new ExtensionFilter("JPEG Files", "*.jpg"));
			File file = fileChooser.showOpenDialog(null);
            if (file != null) {
            	
            	String path = file.getAbsolutePath();
            	int index = path.indexOf("images");
            	if (index != -1) {
            		path = path.substring(index + 7);
            		imagePath = path;
            		Image image = new Image(MainApp.class.getResourceAsStream(path));
            		//Image image = new Image(file.getAbsolutePath());
                	imageView.setImage(image);
            	}
            	
                System.out.println(file.getAbsolutePath());
            }
 


	}
	
	@FXML
	private void handleAddingIngredient() {
		listIngr.getItems().add(txtIngName.getText());
		txtIngName.setText("");
		txtIngName.setFocusTraversable(true);
		
	}
	
	@FXML
	private void handleAddingNutritionFact() {
		String nutritionName = cboNutrifact.getSelectionModel().getSelectedItem().toString();
		
		listNutrifact.getItems().add(nutritionName + ": " + txtNutrifact.getText());
		txtNutrifact.setText("");
	}
	
	@FXML
	private void handleReseting() {
		txtName.setText("");
		txtDescription.setText("");
		imageView.setImage(null);
		txtIngName.setAccessibleHelp("");
		txtNutrifact.setText("");
		listIngr.getItems().clear();
		listNutrifact.getItems().clear();
	}
	
	@FXML
	private void handleSavingRecipe() {
		Recipe recipe = new Recipe();
		recipe.setRecipeID(UUID.randomUUID().toString());
		recipe.setName( txtName.getText());
		recipe.setDescription(txtDescription.getText());
		recipe.setImage(imagePath);
		recipe.setCategoryID(getCategoryID(cboCategory.getSelectionModel().getSelectedItem().toString()));
	/*	List<Recipe> recipes = ObjectUtilities.loadRecipeData();
		recipes.add(recipe);*/

		recipe.setIngredient(new ArrayList<String>(listIngr.getItems()));
		ObjectUtilities.insertRecipe(recipe);
		
		Alert alert = new Alert(AlertType.INFORMATION);

		alert.setTitle("Confirmation");

		String s = "The \""+txtName.getText()+"\" recipe was saved!";

		alert.setContentText(s);

		alert.show();
		try {
            // Load the fxml file and set into the center of the main layout
    		
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("MainApp.fxml"));
            AnchorPane pane = (AnchorPane) loader.load();
            MainApp.rootLayout.setCenter(pane);
 

        } catch (IOException e) {
            // Exception gets thrown if the fxml file could not be loaded
            e.printStackTrace();
        }
	}
	
	@FXML
    private void initialize() {
		cboNutrifact.getItems().add("Amount Per");
		cboNutrifact.getItems().add("Calories");
		cboNutrifact.getItems().add("Total Fat");
		cboNutrifact.getItems().add("Saturated fat ");
		cboNutrifact.getItems().add("Polyunsaturated fat");
		cboNutrifact.getItems().add("Monounsaturated fat");
		cboNutrifact.getItems().add("Trans fat");
		cboNutrifact.getItems().add("Cholesterol");
		cboNutrifact.getItems().add("Sodium");
		cboNutrifact.getItems().add("Potassium ");
		cboNutrifact.getItems().add("Total Carbohydrate");
		cboNutrifact.getItems().add("Dietary fiber");
		cboNutrifact.getItems().add("Sugar");
		cboNutrifact.getItems().add("Protein");
		
		cboNutrifact.getItems().add("Vitamin A");
		cboNutrifact.getItems().add("Vitamin C");
		cboNutrifact.getItems().add("Calcium");
		cboNutrifact.getItems().add("Iron");
		cboNutrifact.getItems().add("Vitamin D");
		cboNutrifact.getItems().add("Vitamin B-6");
		cboNutrifact.getItems().add("Vitamin B-12");
		cboNutrifact.getItems().add("Magnesium");
		
		List<Category> list = ObjectUtilities.loadCategoryData();
		cboCategory.getItems().clear();
		for (Category category: list) {
			cboCategory.getItems().add(category.getName());
		}
		
		if (MainAppController.isModifying) {
			Recipe recipe = ObjectUtilities.getRecipeID(MainAppController.currentID);
			txtName.setText(recipe.getName());
			txtDescription.setText(recipe.getDescription());
			Image image = new Image(MainApp.class.getResourceAsStream(recipe.getImage()));
    		
        	imageView.setImage(image);
        	//List<String>
        	listIngr.getItems().addAll(recipe.getIngredient());
		} else {
			txtName.setText("");
			txtDescription.setText("");
			imageView.setImage(null);
			txtIngName.setAccessibleHelp("");
			txtNutrifact.setText("");
			listIngr.getItems().clear();
			listNutrifact.getItems().clear();
		}
	
	}
	
	private String getCategoryID(String name) {
		List<Category> list = ObjectUtilities.loadCategoryData();
		for (Category category: list) {
			if (name.equals(category.getName())) {
				return category.getCategoryID();
			}
		}
		return null;
	}

	
	public void setModifying(boolean val) {
		isUpdate = true;
	}
	
	public void setModifyingID(String ID) {
		this.modifyingID= ID;
	}
}
