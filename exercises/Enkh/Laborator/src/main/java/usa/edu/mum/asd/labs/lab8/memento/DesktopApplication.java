package usa.edu.mum.asd.labs.lab8.memento;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import usa.edu.mum.asd.labs.lab8.facade.DBFacade;

public class DesktopApplication extends Application {

    final double rem = Font.getDefault().getSize();
    final String WINDOW_TITLE = "User profile";
    final String ID = "Id";
    final String FIRSTNAME = "Firstname";
    final String LASTNAME = "Lastname";
    final String LOAD = "Load";
    final String UNDO = "Undo";
    final String SAVE = "Save";
    final Font labelFont = new Font(12);
    private TextField id;
    private TextField firstname;
    private TextField lastname;
    private HBox topPanel;
    private HBox bottomPanel;
    private Button btnLoad;
    private Button btnUndo;
    private Button btnSave;
    private DBFacade dbFacade = new DBFacade();
    private CareTaker careTaker = new CareTaker();
    private int index = -1;
    private UserProfile userProfile;

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle(WINDOW_TITLE);
        defineTopPanel();
        defineBottomPanel();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        grid.add(topPanel, 0, 0);
        bottomPanel.setPadding(new Insets(35, 0, 0, 0));
        grid.add(bottomPanel, 0, 2);

        btnLoad.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                loadUserProfile();
            }
        });
        btnUndo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                undoUserProfile();
            }
        });
        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                saveUserProfile();
            }
        });

        Scene scene = new Scene(grid, 500, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void saveUserProfile() {
        userProfile = new UserProfile(id.getText(), firstname.getText(), lastname.getText());
        dbFacade.saveUserProfile(userProfile);
        clearFields();
        careTaker.add(userProfile.getMemento());
        index = careTaker.getIndex();
    }

    private void loadUserProfile() {
        userProfile = dbFacade.getUserProfile(id.getText());
        if (userProfile == null) {
            showAlert("User profile is not found.");
            clearFields();
        } else {
            showFields();
            careTaker.add(userProfile.getMemento());
            index = careTaker.getIndex();
        }
    }

    private void undoUserProfile() {
        if (index == -1) {
            showAlert("No more previous state.");
            return;
        }
        userProfile.setMemento(careTaker.get(index));
        index = -1;
        showFields();
    }

    private void clearFields() {
        id.setText("");
        firstname.setText("");
        lastname.setText("");
    }

    private void showFields() {
        id.setText(userProfile.getId());
        firstname.setText(userProfile.getFirstname());
        lastname.setText(userProfile.getLastname());
    }

    private void showAlert(String text) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Warning");
        alert.setHeaderText("Warning");
        alert.setContentText(text);
        alert.show();
    }

    private void defineBottomPanel() {
        btnLoad = new Button(LOAD);
        btnUndo = new Button(UNDO);
        btnSave = new Button(SAVE);
        bottomPanel = new HBox();
        bottomPanel.setAlignment(Pos.CENTER);
        bottomPanel.getChildren().add(btnLoad);
        bottomPanel.getChildren().add(btnUndo);
        bottomPanel.getChildren().add(btnSave);
    }

    private void defineTopPanel() {
        VBox id = getItem(ID);
        VBox firstname = getItem(FIRSTNAME);
        VBox lastname = getItem(LASTNAME);
        topPanel = new HBox(rem * 5);
        topPanel.getChildren().addAll(id, firstname, lastname);
    }

    private VBox getItem(String labelName) {
        Label label = new Label(labelName);
        label.setFont(labelFont);
        VBox item = new VBox(0.2 * rem);
        TextField textField = null;
        switch (labelName) {
            case ID:
                id = new TextField();
                textField = id;
                break;
            case FIRSTNAME:
                firstname = new TextField();
                textField = firstname;
                break;
            case LASTNAME:
                lastname = new TextField();
                textField = lastname;
                break;
            default:
                break;
        }
        item.getChildren().addAll(label, textField);
        return item;
    }

    public static void main(String[] args) {
        launch(args);
    }
}