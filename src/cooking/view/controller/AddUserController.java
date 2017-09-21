package cooking.view.controller;

import java.util.ArrayList;
import java.util.List;

import cooking.model.concrete.IUserAndProfile;
import cooking.model.concrete.UserAndProfileFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class AddUserController {
	@FXML
	private TextField txt_fName;
	@FXML
	private TextField txt_email;
	@FXML
	private TextField txt_weight;
	@FXML
	private RadioButton rb_male;
	@FXML
	private ToggleGroup gender;
	@FXML
	private RadioButton rb_female;
	@FXML
	private DatePicker dp_birthdate;
	@FXML
	private TextArea txt_favFood;
	@FXML
	private TextField txt_height;
	@FXML
	private TextField txt_lName;
	@FXML
	private TextField txt_userName;
	@FXML
	private Button btn_backSignUp;
	@FXML
	private Button btn_resetSignUp;
	@FXML
	private Button btn_signUp;
	@FXML
	private PasswordField txt_confPswrd;
	@FXML
	private PasswordField txt_pswrd;
	@FXML
	private Label lbl_fNameVal;
	@FXML
	private Label lbl_lNameVal;
	@FXML
	private Label lbl_emailVal;
	@FXML
	private Label lbl_genderVal;
	@FXML
	private Label lbl_weightVal;
	@FXML
	private Label lbl_heightVal;
	@FXML
	private Label lbl_birthdateVal;
	@FXML
	private Label lbl_usernameVal;
	@FXML
	private Label lbl_confPswrdVal;
	@FXML
	private Label lbl_pswrdVal;
	@FXML
	private RadioButton rb_admin;
	@FXML
	private ToggleGroup Role;
	@FXML
	private RadioButton rb_user;
	@FXML
	private Button btn_addAddress;

	// Event Listener on Button[#btn_addAddress].onAction
	@SuppressWarnings("unused")
	@FXML
	public void handleButtonAction(ActionEvent event) throws Exception {
		Stage st;
		Parent root;
		if (event.getSource() == btn_signUp) {
			// initialize a new user

			// createUser();
			double h = Double.parseDouble(txt_height.getText());
			double w = Double.parseDouble(txt_weight.getText());
			List<String> ff = new ArrayList<String>();
			String role;
			if (rb_admin.isSelected())
				role = "admin";
			else
				role = "user";

			ff.add(txt_favFood.getText());

			IUserAndProfile uap = UserAndProfileFactory.createUserAndProfile("10", txt_userName.getText(), txt_pswrd.getText(),
					role, txt_fName.getText() + " " + txt_lName.getText(), txt_email.getText(), dp_birthdate.getValue().toString(),
					rb_male.isSelected()?"Male":"Female", h, w, ff);

			System.out.print(uap.toString());
			// Convert to Jason
			
			st = (Stage) btn_addAddress.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
			Scene sc = new Scene(root);
			st.setScene(sc);
			st.show();
		}

	}
}
