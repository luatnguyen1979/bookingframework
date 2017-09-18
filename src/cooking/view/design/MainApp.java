package cooking.view.design;

import java.io.IOException;

import cooking.model.concrete.Recipe;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {
/*    @FXML
    private AnchorPane mainPane;*/
	private Stage primaryStage;
    private BorderPane rootLayout;

    /**
     * The data as an observable list of Persons.
     */
    private ObservableList<Recipe> personData = FXCollections.observableArrayList();

    /**
     * Constructor
     */
    public MainApp() {
        
    }

    /**
     * Returns the data as an observable list of Persons. 
     * @return
     */
    public ObservableList<Recipe> getPersonData() {
        return personData;
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Cooking System");

        try {
            // Load the root layout from the fxml file
          FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("RootLayout.fxml"));
            
            rootLayout = (BorderPane) loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // Exception gets thrown if the fxml file could not be loaded
            e.printStackTrace();
        }

        showPersonOverview();
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    /**
     * Shows the person overview scene.
     */
    public void showPersonOverview() {
    	try {
            // Load the fxml file and set into the center of the main layout
    		
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("MainApp.fxml"));
            AnchorPane overviewPage = (AnchorPane) loader.load();
            rootLayout.setCenter(overviewPage);

            // Give the controller access to the main app
            MainAppController controller = loader.getController();
            
 //           loader.load();
           //controller.setMainApp(this);
            

            
            
            
            
            
            

        } catch (IOException e) {
            // Exception gets thrown if the fxml file could not be loaded
            e.printStackTrace();
        }
    }

	public static void main(String[] args) {
		launch(args);
	}
}
