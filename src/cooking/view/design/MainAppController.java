/**
 * This the java source code of Cooking System @ MPP class, 2017
 */
package cooking.view.design;

import java.util.List;
import java.util.Optional;

import cooking.model.concrete.ObjectUtilities;
import cooking.model.concrete.Recipe;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    private TextField txtGo;
	
	private MainApp mainApp;

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
    	showPersonDetails(null);
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

        // Listen for selection changes
        recipeTable.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Recipe>() {

          @Override
          public void changed(ObservableValue<? extends Recipe> observable,
              Recipe oldValue, Recipe newValue) {
        	  showPersonDetails(newValue);
        	  
          }
        });
    	//showPersonDetails(null);
    }
    
	private void showPersonDetails(Recipe newValue) {
		if (newValue != null) {
		String id = newValue.getRecipeID();
		if (id.equals("9c618a31-60f5-40c3-a3bf-e39b34e0db9a")) {

			setRecipeValues("beef");

		} else {
			if (id.equals("30c7d475-f735-4ffd-acf1-962f878c7403")) {

				setRecipeValues("pho");

			} else {
				setRecipeValues("");
			}
		}
		} else {
			setRecipeValues("");
		}

	}
    
	private void setRecipeValues(String str) {
		if (str.equals("beef")) {
			Image image = new Image(MainApp.class.getResourceAsStream("beefsteak.png"));
			img.setImage(image);

			lblFood.setText("Beefsteak");
			lbldescription.setText(
					"A beefsteak is a flat cut of beef, usually cut perpendicular to the muscle fibers. Beefsteaks are usually grilled, pan-fried, or broiled. The more tender cuts from the loin and rib are cooked quickly, using dry heat, and served whole.");

			lable0_1.setText("1 lb beef sirloin, thinly sliced.");
			lable1_1.setText("1/4 cup soy sauce.");
			lable2_1.setText("1 pc. lemon or 3 calamansi.");
			lable3_1.setText("1/2 tsp ground black pepper.");
			lable4_1.setText("3 clove garlic, crushed.");
			lable5_1.setText("1 large onion, sliced into rings.");
			lable0_3.setText("3 tbsps. cooking oil.");
			lable1_3.setText("1 salt to taste.");
			lable2_3.setText("");
			lable3_3.setText("");
			lable4_3.setText("");
			lable5_3.setText("");

			lbl0_1.setText("1 steak (223g)");
			lbl1_1.setText("299");
			lbl3_1.setText("12g");
			lbl4_1.setText("4.2g");
			lbl5_1.setText("0.4g");
			lbl6_1.setText("5g");
			lbl7_1.setText("0.6g");
			lbl8_1.setText("149mg");
			lbl9_1.setText("123mg");
			lbl10_1.setText("836mg");
			lbl11_1.setText("0g");
			lbl12_1.setText("0g");
			lbl13_1.setText("0g");
			lbl14_1.setText("48g");
			lbl15_1.setText("0%");
			lbl16_1.setText("1%");
			lbl17_1.setText("1%");
			lbl18_1.setText("100%");

			lbl3_3.setText("18%");
			lbl4_3.setText("21%");
			lbl8_3.setText("49%");
			lbl9_3.setText("5%");
			lbl10_3.setText("23%");
			lbl11_3.setText("0%");
			lbl12_3.setText("0%");
			lbl14_3.setText("96%");
			lbl15_3.setText("0%");
			lbl16_3.setText("25%");
			lbl17_3.setText("60%");
			lbl18_3.setText("14%");
		} else {
			if (str.equals("pho")) {
				img.setImage(new Image(MainApp.class.getResourceAsStream("pho.jpg")));

				lblFood.setText("Pho Noodle");
				lbldescription.setText(
						"Vietnamese beef noodle pho is an easy soup to fall in love with. Those chewy noodles, that savory broth, the tender slices of beef — all those crunchy, spicy, herby garnishes we get to toss on top. On a cold evening, after a rough day at work, when we're sick, on a lazy weekend afternoon — a bowl of piping hot pho is pretty much always a good idea.");

				lable0_1.setText("2 boxes beef broth.");
				lable1_1.setText("2 beef bullion cubes.");
				lable2_1.setText("1 pkg thin sliced beef about 12-16 oz.");
				lable3_1.setText("Adolf's meat tenderizer.");
				lable4_1.setText("1/2 cup thinly sliced green onions.");
				lable5_1.setText("1 box thinly sliced fresh mushrooms.");
				lable0_3.setText("1 bunch bean sprouts.");
				lable1_3.setText("3 handfuls fresh spinach leaves.");
				lable2_3.setText("1 stalk cinnamon.");
				lable3_3.setText("1 piece grated fresh ginger.");
				lable4_3.setText("rice noodles cooked.");
				lable5_3.setText("green onions for garnish.");

				lbl0_1.setText("1 cup, chopped (136g)");
				lbl1_1.setText("211");
				lbl3_1.setText("14g");
				lbl4_1.setText("4.4g");
				lbl5_1.setText("1.9g");
				lbl6_1.setText("6g");
				lbl7_1.setText("0g");
				lbl8_1.setText("507mg");
				lbl9_1.setText("169mg");
				lbl10_1.setText("171mg");
				lbl11_1.setText("1.5g");
				lbl12_1.setText("0g");
				lbl13_1.setText("1.5g");
				lbl14_1.setText("17g");
				lbl15_1.setText("14%");
				lbl16_1.setText("6%");
				lbl17_1.setText("29%");
				lbl18_1.setText("25%");

				lbl3_3.setText("21%");
				lbl4_3.setText("22%");
				lbl8_3.setText("169%");
				lbl9_3.setText("5%");
				lbl10_3.setText("7%");
				lbl11_3.setText("4%");
				lbl12_3.setText("0%");
				lbl14_3.setText("0%");
				lbl15_3.setText("0%");
				lbl16_3.setText("8%");
				lbl17_3.setText("10%");
				lbl18_3.setText("3%");
			} else {
				img.setImage(new Image(MainApp.class.getResourceAsStream("normal.png")));

				lblFood.setText("");
				lbldescription.setText("");

				lable0_1.setText("");
				lable1_1.setText("");
				lable2_1.setText("");
				lable3_1.setText("");
				lable4_1.setText("");
				lable5_1.setText("");
				lable0_3.setText("");
				lable1_3.setText("");
				lable2_3.setText("");
				lable3_3.setText("");
				lable4_3.setText("");
				lable5_3.setText("");

				lbl0_1.setText("");
				lbl1_1.setText("");
				lbl3_1.setText("");
				lbl4_1.setText("");
				lbl5_1.setText("");
				lbl6_1.setText("");
				lbl7_1.setText("");
				lbl8_1.setText("");
				lbl9_1.setText("");
				lbl10_1.setText("");
				lbl11_1.setText("");
				lbl12_1.setText("");
				lbl13_1.setText("");
				lbl14_1.setText("");
				lbl15_1.setText("");
				lbl16_1.setText("");
				lbl17_1.setText("");
				lbl18_1.setText("");

				lbl3_3.setText("");
				lbl4_3.setText("");
				lbl8_3.setText("");
				lbl9_3.setText("");
				lbl10_3.setText("");
				lbl11_3.setText("");
				lbl12_3.setText("");
				lbl14_3.setText("");
				lbl15_3.setText("");
				lbl16_3.setText("");
				lbl17_3.setText("");
				lbl18_3.setText("");
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

			String s = "Confirm to clear text in text field !";

			alert.setContentText(s);

			Optional<ButtonType> result = alert.showAndWait();

			if ((result.isPresent()) && (result.get() == ButtonType.OK)) {

				/*
				 *     textFld.setText("");
				 * 
				 *     actionStatus.
				 * setText("An example of Alert Dialogs. Enter some text and save.");
				 * 
				 *     textFld.requestFocus();
				 */
				System.out.println("Deleted!");

			} else {
				System.out.println("Canceled!");
			}

			/*
			 * Dialog.showWarningDialog(mainApp.getPrimaryStage(),
			 * "Please select a person in the table.", "No Person Selected",
			 * "No Selection"); recipeTable.getItems().remove(selectedIndex);
			 */
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
	  /*int selectedIndex = recipeTable.getSelectionModel().getSelectedIndex();
	  if (selectedIndex >= 0) {
		  recipeTable.getItems().remove(selectedIndex);
	  } else {
	    // Nothing selected
	    Dialogs.showWarningDialog(mainApp.getPrimaryStage(),
	        "Please select a person in the table.",
	        "No Person Selected", "No Selection");
	  }*/
	}
	
	@FXML
	private void handleAddRecipe() {
	  /*int selectedIndex = recipeTable.getSelectionModel().getSelectedIndex();
	  if (selectedIndex >= 0) {
		  recipeTable.getItems().remove(selectedIndex);
	  } else {
	    // Nothing selected
	    Dialogs.showWarningDialog(mainApp.getPrimaryStage(),
	        "Please select a person in the table.",
	        "No Person Selected", "No Selection");
	  }*/
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
}
