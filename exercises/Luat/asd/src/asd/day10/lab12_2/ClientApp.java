package asd.day10.lab12_2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * 
 * @author luatnguyen
 *
 */
public class ClientApp extends Application implements Initializable{

	@FXML
	TextField txtName;
	@FXML
	ListView<Person> personList;
	
	//Concrete Subject
	private PersonData personData = new PersonData();
	private ObservableList<Person> persons;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		new PersonObserver(personData);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("ClientApp.fxml"));
		primaryStage.setTitle("Observer Pattern Demo");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	@FXML
	protected void handleAddButtonAction(ActionEvent e) {
		if (txtName.getText().length() > 0){
			Person newPerson = new Person(txtName.getText());
			personData.addPerson(newPerson);
			persons = FXCollections.observableArrayList(personData.getPersonData());
			personList.setItems(persons);
			txtName.clear();
		}
	}

	@FXML
	protected void handleRemoveButtonAction(ActionEvent e) {
		Person personToRemove = personList.getSelectionModel().getSelectedItem();
		personData.removePerson(personToRemove);
		persons = FXCollections.observableArrayList(personData.getPersonData());
		personList.setItems(persons);
	}

}
