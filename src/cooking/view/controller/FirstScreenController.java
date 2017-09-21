package cooking.view.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FirstScreenController {
	@FXML
	private Button btn_search;
	@FXML
	private Button btn_signup;
	@FXML
	private Button btn_signin;

	@FXML
	private TextField txt_username;
	@FXML
	private TextField txt_pswrd;
	@FXML
	private TextField txt_search;

	@FXML
	protected void handleButtonAction(ActionEvent event) throws Exception {
		Stage st;
		Parent root;
		
		//Menu m;
		
		if (event.getSource() == btn_signup) {
			st = (Stage) btn_signup.getScene().getWindow();
			FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("AddUser.fxml"));
			root = (Parent)fxmlLoader.load() ;
			
		} else if (event.getSource() == btn_search) {
			st = (Stage) btn_search.getScene().getWindow();
			FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Template.fxml"));
			root = (Parent)fxmlLoader.load() ;
			
			//root = FXMLLoader.load(getClass().getResource("Template.fxml"));
		} else {
			st = (Stage) btn_signin.getScene().getWindow();
			FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Template.fxml"));
			root = (Parent)fxmlLoader.load() ;
			
			//root = FXMLLoader.load(getClass().getResource("Template.fxml"));
			
		}
		st.setTitle("Welcome to CookMe!");
		Scene scene = new Scene(root);
		st.setScene(scene);
		st.show();
	}
}
