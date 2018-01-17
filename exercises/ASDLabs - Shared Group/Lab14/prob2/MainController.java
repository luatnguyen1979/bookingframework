package com.asd.lab14.prob2;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainController implements CollectionObserver, Initializable{
	private Collection nameCollection;
	
	@FXML
	private ListView<String> lstName;
	
	@FXML
	private TextField txtName;

	
	@FXML
	void btnRemoveClick(ActionEvent event) throws Exception {
		nameCollection.removeName(0);
	}
	
	@FXML
	void btnAddClick(ActionEvent event) throws Exception {
		String name = txtName.getText();
		nameCollection.addName(name);
	}

	@Override
	public void update(ArrayList<String> names) {
		lstName.setItems(FXCollections.observableArrayList(names));
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Mark Taiwan");
		names.add("Jessica Alba");
		names.add("Donald Trump");
		names.add("Berne Senders");
		nameCollection = new Collection(names, this);
		
		lstName.setItems(FXCollections.observableArrayList(names));
	}
	
	
}
