/**
 * This the java source code of Cooking System @ MPP class, 2017
 */
package cooking.view.design;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Van Gia Luat Nguyen
 *
 */
class MyDialog extends Stage {
	public static boolean isAdmin= false;
    public MyDialog(Stage owner) {
        super();
        initOwner(owner);
        setTitle("Login Form");
        Group root = new Group();
        Scene scene = new Scene(root, 250, 150, Color.WHITE);
        setScene(scene);

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);

        Label userNameLbl = new Label("User Name: ");
        gridpane.add(userNameLbl, 0, 1);

        Label passwordLbl = new Label("Password: ");
        gridpane.add(passwordLbl, 0, 2);
        final TextField userNameFld = new TextField("Admin");
        gridpane.add(userNameFld, 1, 1);

        final PasswordField passwordFld = new PasswordField();
        passwordFld.setText("Password123");
        gridpane.add(passwordFld, 1, 2);

        Button login = new Button("Login");
        login.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
            	if (userNameFld.getText().equals("Admin") && passwordFld.getText().equals("Password123")) {
            		isAdmin = true;
            		MainAppController.isAdmin = true;
            	}
                close();
            }
        });
        gridpane.add(login, 1, 3);
        
        Button cancel = new Button("Cancel");
        cancel.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                close();
            }
        });
        GridPane.setHalignment(login, HPos.RIGHT);
        root.getChildren().add(gridpane);
    }
}
