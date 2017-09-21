/**
 * This the java source code of Cooking System @ MPP class, 2017
 */
package cooking.view.design;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import cooking.model.concrete.NutritionFact;
import cooking.model.concrete.ObjectUtilities;
import cooking.model.concrete.Recipe;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author Van Gia Luat Nguyen
 *
 */
public class MainAppController {
	private ObservableList<Recipe> recipeData = FXCollections.observableArrayList();
	@FXML
	private TableView<Recipe> recipeTable;
	@FXML
	private TableColumn<Recipe, String> noColumn;
	
	@FXML
	private TableColumn<Recipe, String> nameColumn;
	
	/*@FXML
    private Label[] lable1_1;*/
	
	@FXML
    private Label lable0_1;
	@FXML
    private Label lable1_1;
	@FXML
    private Label lable2_1;
	@FXML
    private Label lable3_1;
	@FXML
    private Label lable4_1;
	@FXML
    private Label lable5_1;
	@FXML
    private Label lable0_3;
	@FXML
    private Label lable1_3;
	@FXML
    private Label lable2_3;
	@FXML
    private Label lable3_3;
	@FXML
    private Label lable4_3;
	@FXML
    private Label lable5_3;
	
	@FXML
    private Label lbl0_1;
	@FXML
    private Label lbl1_1;
	@FXML
    private Label lbl3_1;
	@FXML
    private Label lbl4_1;
	@FXML
    private Label lbl5_1;
	@FXML
    private Label lbl6_1;
	@FXML
    private Label lbl7_1;
	@FXML
    private Label lbl8_1;
	@FXML
    private Label lbl9_1;
	@FXML
    private Label lbl10_1;
	@FXML
    private Label lbl11_1;
	@FXML
    private Label lbl12_1;
	@FXML
    private Label lbl13_1;
	@FXML
    private Label lbl14_1;
	@FXML
    private Label lbl15_1;
	@FXML
    private Label lbl16_1;
	@FXML
    private Label lbl17_1;
	@FXML
    private Label lbl18_1;
	
	@FXML
    private Label lbl3_3;
	@FXML
    private Label lbl4_3;
	@FXML
    private Label lbl8_3;
	@FXML
    private Label lbl9_3;
	@FXML
    private Label lbl10_3;
	@FXML
    private Label lbl11_3;
	@FXML
    private Label lbl12_3;
	@FXML
    private Label lbl14_3;
	@FXML
    private Label lbl15_3;
	@FXML
    private Label lbl16_3;
	@FXML
    private Label lbl17_3;
	@FXML
    private Label lbl18_3;
	@FXML
	private ImageView img;
	@FXML
    private Label lblFood;
	@FXML
    private Label lbldescription;
	
	@FXML
    private Button btnGo;
	
	@FXML
    private Button btnNew;
	
	@FXML
    private Button btnEdit;
	
	@FXML
    private Button btnDelete;
	
	@FXML
    private Button btnObtain;
	
	@FXML
    private TextField txtGo;
	
	/*@FXML
	private MainApp mainPane;*/
	public static boolean isAdmin = false;

    private AnchorPane mainPane;
	
	private List<Label> ingredientList;
	
	private Stage primaryStage;
	
	public static String currentID;
	public static boolean isModifying = false;
	
	
	

/*  @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label streetLabel;
    @FXML
    private Label postalCodeLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label birthdayLabel;*/

    /**
     * The data as an observable list of Persons.
     */
    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public MainAppController() {
    	
    	
    }
    
    /**
     * Returns the data as an observable list of Persons. 
     * @return
     */
    public ObservableList<Recipe> getRecipeData() {
        return recipeData;
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	initiateIngredientLabelList();
    	btnNew.setDisable(!isAdmin);
    	btnEdit.setDisable(!isAdmin);
    	btnDelete.setDisable(!isAdmin);
    	//showPersonDetails(null);
    	
    	List<Recipe> list = ObjectUtilities.loadRecipeData();
    	
    	int i = 1;
		for (Recipe recipe : list) {
			recipe.setNo(i ++);
			recipeData.add(recipe);
		}

		// Initialize the Recipe table
		noColumn.setCellValueFactory(new PropertyValueFactory<Recipe, String>("no"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<Recipe, String>("name"));
		recipeTable.setItems(recipeData);

        // clear person
        //showPersonDetails(null);
		
		if (list.size() > 0) {
			recipeTable.getSelectionModel().select(0);
	    	int selectedIndex = recipeTable.getSelectionModel().getSelectedIndex();
	    	
	    	  if (selectedIndex >= 0)
	    	  setRecipeDetailValues(recipeData.get(selectedIndex), selectedIndex);
		}

        // Listen for selection changes
        recipeTable.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Recipe>() {
        	
          @Override
          public void changed(ObservableValue<? extends Recipe> observable,
              Recipe oldValue, Recipe newValue) {
        	  int selectedIndex = recipeTable.getSelectionModel().getSelectedIndex();
        	  if (selectedIndex >= 0)
        	  setRecipeDetailValues(newValue, selectedIndex);
        	  currentID = newValue.getRecipeID();
        	  
          }
        });
        
    	//showPersonDetails(null);
    }
    
    @FXML
	private void handleSelectionRow() {

	}
    
    
	private void setRecipeDetailValues(Recipe recipe, int index) {
		
			Image image = new Image(MainApp.class.getResourceAsStream(recipe.getImage()));
		//Image image = new Image(recipe.getImage());
			img.setImage(image);

			lblFood.setText(recipe.getName());
			lbldescription.setText(recipe.getDescription());
			int i = 0;
			for (String value : recipe.getIngredient()) {
				ingredientList.get(i).setText(value);
				i ++;
			}
			
			//Clean previous data
			for (;i<ingredientList.size(); i++) {
				ingredientList.get(i).setText("");
			}

			setNutrifactValue(recipe.getNutritionFact(), index);
		
	}
	
	
	
	private void setNutrifactValue(NutritionFact nutrifact, int index) {
		lbl0_1.setText(nutrifact.getAmountPer());
		lbl1_1.setText(nutrifact.getCalories());
		lbl3_1.setText(nutrifact.getTotalFat());
		lbl4_1.setText(nutrifact.getSaturatedfat());
		lbl5_1.setText(nutrifact.getPolyunsaturatedfat());
		lbl6_1.setText(nutrifact.getMonounsaturatedfat());
		lbl7_1.setText(nutrifact.getTransfat());
		lbl8_1.setText(nutrifact.getCholesterol());
		lbl9_1.setText(nutrifact.getSodium());
		lbl10_1.setText(nutrifact.getPotassium());
		lbl11_1.setText(nutrifact.getTotalCarbohydrate());
		lbl12_1.setText(nutrifact.getDietaryFiber());
		lbl13_1.setText(nutrifact.getSugar());
		lbl14_1.setText(nutrifact.getProtein());
		lbl15_1.setText(nutrifact.getVitaminA());
		lbl16_1.setText(nutrifact.getCalcium());
		lbl17_1.setText(nutrifact.getVitaminD());
		lbl18_1.setText(nutrifact.getVitaminB12());
		lbl15_3.setText(nutrifact.getVitaminC());
		lbl16_3.setText(nutrifact.getIron());
		lbl17_3.setText(nutrifact.getVitaminB6());
		lbl18_3.setText(nutrifact.getMagnesium());
		
		if (index % 2 == 1) {

			lbl3_3.setText("18%");
			lbl4_3.setText("21%");
			lbl8_3.setText("49%");
			lbl9_3.setText("5%");
			lbl10_3.setText("23%");
			lbl11_3.setText("0%");
			lbl12_3.setText("0%");
			lbl14_3.setText("96%");
			

		} else {
			if (index % 2 == 0) {
				lbl3_3.setText("21%");
				lbl4_3.setText("22%");
				lbl8_3.setText("169%");
				lbl9_3.setText("5%");
				lbl10_3.setText("7%");
				lbl11_3.setText("4%");
				lbl12_3.setText("0%");
				lbl14_3.setText("0%");
				
			}

		}
	}
	
	@FXML
	private void handleSearch() {
		loadNFilterRecipe(txtGo.getText());
	}
	
	@FXML
	private void handleDeleteRecipe() {
		int selectedIndex = recipeTable.getSelectionModel().getSelectedIndex();
		if (selectedIndex >= 0) {

			Alert alert = new Alert(AlertType.CONFIRMATION);

			alert.setTitle("Confirmation");

			String s = "Do you want to delete the current recipe?";

			alert.setContentText(s);

			Optional<ButtonType> result = alert.showAndWait();

			if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
				Recipe recipe = recipeTable.getItems().remove(selectedIndex);
				ObjectUtilities.removeRecipe(recipe.getRecipeID());

			} else {
				System.out.println("Canceled!");
			}

			
		} else {
			// Nothing selected
			/*
			 * Dialog.showWarningDialog(mainApp.getPrimaryStage(),
			 * "Please select a person in the table.", "No Person Selected",
			 * "No Selection");
			 */
		}
	}
	
	@FXML
	private void handleModifyRecipe() {
		try {
            // Load the fxml file and set into the center of the main layout
			this.isModifying = true;
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("DetailRecipe.fxml"));
            AnchorPane overviewPage = (AnchorPane) loader.load();
            MainApp.rootLayout.setCenter(overviewPage);
            DetailRecipeController controller = loader.getController();
            /*controller.setModifying(true);

            controller.setModifyingID(currentID);*/
            
           

        } catch (IOException e) {
            // Exception gets thrown if the fxml file could not be loaded
            e.printStackTrace();
        }
	}
	
	@FXML
	private void handleAddRecipe() {
		try {
			//this.isModifying = false;
            // Load the fxml file and set into the center of the main layout
    		
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("DetailRecipe.fxml"));
            AnchorPane overviewPage = (AnchorPane) loader.load();
            MainApp.rootLayout.setCenter(overviewPage);
 

        } catch (IOException e) {
            // Exception gets thrown if the fxml file could not be loaded
            e.printStackTrace();
        }
	}

	private void loadNFilterRecipe(String str) {
		List<Recipe> list = ObjectUtilities.loadRecipeData();
    	int i = 1;
    	recipeData = FXCollections.observableArrayList();
		for (Recipe recipe : list) {
			if (recipe.getName().trim().toLowerCase().indexOf(str.trim().toLowerCase()) != -1) {
			recipe.setNo(i ++);		
			recipeData.add(recipe);
			}
		}

		recipeTable.setItems(recipeData);
	}
	
	private void initiateIngredientLabelList() {
		ingredientList = new ArrayList<Label>();
		
	    ingredientList.add(lable0_1);
		
	    ingredientList.add(lable1_1);
		
	    ingredientList.add(lable2_1);
		
	    ingredientList.add(lable3_1);
		
	    ingredientList.add(lable4_1);
		
	    ingredientList.add(lable5_1);
		
	    ingredientList.add(lable0_3);
		
	    ingredientList.add(lable1_3);
		
	    ingredientList.add(lable2_3);
		
	    ingredientList.add(lable3_3);
		
	    ingredientList.add(lable4_3);
		
	    ingredientList.add(lable5_3);
	}

	public void setMainController (AnchorPane mainPane) {
		this.mainPane = mainPane;
		
	}
	
	public void setPrimaryStage (Stage stage) {
		this.primaryStage = stage;
		
	}
	
	@FXML
	public void handleObtainingPermission() {
		if (btnObtain.getText().equals("Release Permissions")) {
			Alert alert = new Alert(AlertType.CONFIRMATION);

			alert.setTitle("Confirmation");

			String s = "Do you want to release your Admin permission?";

			alert.setContentText(s);

			Optional<ButtonType> result = alert.showAndWait();

			if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
				this.isAdmin = false;
				
				btnDelete.setDisable(true);
	        	btnEdit.setDisable(true);
	        	btnNew.setDisable(true);
	        	btnObtain.setText("Obtain Permissions");

			}
			
		} else {
		Stage myDialog = new MyDialog(null);
        myDialog.sizeToScene();
        myDialog.showAndWait();
        if (this.isAdmin) {
        	btnDelete.setDisable(false);
        	btnEdit.setDisable(false);
        	btnNew.setDisable(false);
        	btnObtain.setText("Release Permissions");
        }
		}
	}
	
}
