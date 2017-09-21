/**
 * This the java source code of Cooking System @ MPP class, 2017
 */
package cooking.view.controller;

import java.util.Optional;

import javax.security.auth.callback.Callback;

import cooking.model.concrete.User;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;;

/**
 * @author Van Gia Luat Nguyen
 *
 */
public class RootLayoutController {
	
	public static boolean isAdmin = false;

	/**
	 * 
	 */
	public RootLayoutController() {
		// TODO Auto-generated constructor stub
	}

	@FXML
	private void handleClosing() {
		System.exit(1);
	}

	@FXML
	private void handleLogin() {
		/*Dialog<User> dialog = new Dialog<>();

		dialog.setTitle("Login Form");

		dialog.setHeaderText("Please enter your credentials and \n" +

		    "press Okay (or click title bar 'X' for cancel).");

		dialog.setResizable(true);

		 

		Label label1 = new Label("User name: ");

		Label label2 = new Label("Password: ");

		TextField username = new TextField();

		PasswordField password = new PasswordField();

		         

		GridPane grid = new GridPane();

		grid.add(label1, 1, 1);

		grid.add(username, 2, 1);

		grid.add(label2, 1, 2);

		grid.add(password, 2, 2);

		dialog.getDialogPane().setContent(grid);

		         

		ButtonType buttonTypeOk = new ButtonType("Okay", ButtonData.OK_DONE);
		
		ButtonType buttonTypeCanel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

		dialog.getDialogPane().getButtonTypes().add(buttonTypeOk);

		 

		dialog.setResultConverter(new Callback<ButtonType, User>() {

		    @Override

		    public User call(ButtonType b) {

		 
		        if (b == buttonTypeOk) {

		 

		            return new PhoneBook(username.getText(), password.getText());

		        }

		 

		        return null;

		    }

		});

		         
		
		Optional<User> result = dialog.showAndWait();
	
		         
		
		if (result.isPresent()) {
		
		 
		
//		    actionStatus.setText("Result: " + result.get());

		}*/
		
		Stage myDialog = new MyDialog(null);
        myDialog.sizeToScene();
        myDialog.show();

	}

	@FXML
	private void handleLogout() {

	}

	@FXML
	private void handleSignup() {
		
	}

}



