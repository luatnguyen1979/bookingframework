/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooking.view.design;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 986042
 */
public class CookMe extends Application {
	Stage primaryStage;
	
    @Override
    public void start(Stage stage) throws Exception {
    	this.primaryStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("Template.fxml"));
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    	
    	
    }
    
}
