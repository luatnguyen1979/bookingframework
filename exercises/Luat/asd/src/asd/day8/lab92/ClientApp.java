/**
 * 
 */
package asd.day8.lab92;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * @author luatnguyen
 *
 */
public class ClientApp extends Application {

	@FXML
	TextField txtField;
	@FXML
	Button btnLoad;
	@FXML
	Button btnSave;
	@FXML
	Button btnUndo;

	private Originator originator = new Originator();
	private CareTaker careTaker = new CareTaker();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
		stage.setTitle("Momento Pattern");
		stage.setScene(new Scene(root));
		stage.show();
	}

	@FXML
	protected void handleLoadButtonAction(ActionEvent e) {
		String user = originator.getChangeState();
		txtField.setText(user);
	}

	@FXML
	protected void handleSaveButtonAction(ActionEvent e) {
		originator.setChangeState(txtField.getText());
		careTaker.add(originator.saveStateToMemento());
	}

	@FXML
	protected void handleUndoButtonAction(ActionEvent e) {
		originator.getStateFromMemento(careTaker.undo());
		txtField.setText(originator.getChangeState());
	}

}
