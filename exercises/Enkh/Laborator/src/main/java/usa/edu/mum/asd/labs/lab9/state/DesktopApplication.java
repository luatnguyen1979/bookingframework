package usa.edu.mum.asd.labs.lab9.state;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DesktopApplication extends Application {

    final double rem = Font.getDefault().getSize();
    final String WINDOW_TITLE = "Game";
    private String labelMsg = "Point: %s, Taget: %s";
    private String labelMsg1 = "    Level: %s";
    private Label label = new Label();
    private Label label1 = new Label();
    private HBox bottomPanel;
    private HBox midPanel;
    private HBox topPanel;
    private Button btnLeft = new Button("Left");
    private Button btnRight = new Button("Right");
    private Button btnAccelerate = new Button("Accelerate");
    private Button btnBreak = new Button("Break");
    private Game game = new Game(5, 100);

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle(WINDOW_TITLE);
        defineTopPanel();
        defineMidPanel();
        defineBottomPanel();
        label.setText(String.format(labelMsg, game.getSum(), game.getTarget()));
        label1.setText(String.format(labelMsg1, game.getCurrentState().getName()));

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));


        grid.add(topPanel, 0, 0);
        grid.add(midPanel, 0, 1);
        grid.add(bottomPanel, 0, 2);

        btnLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                game.moveLeft();
                label.setText(String.format(labelMsg, game.getSum(), game.getTarget()));
                label1.setText(String.format(labelMsg1, game.getCurrentState().getName()));
            }
        });

        btnRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                game.moveRight();
                label.setText(String.format(labelMsg, game.getSum(), game.getTarget()));
                label1.setText(String.format(labelMsg1, game.getCurrentState().getName()));
            }
        });

        btnAccelerate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                game.accelerateSpeed();
                label.setText(String.format(labelMsg, game.getSum(), game.getTarget()));
                label1.setText(String.format(labelMsg1, game.getCurrentState().getName()));
            }
        });

        btnBreak.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                game.breakSpeed();
                label.setText(String.format(labelMsg, game.getSum(), game.getTarget()));
                label1.setText(String.format(labelMsg1, game.getCurrentState().getName()));
            }
        });

        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void defineBottomPanel() {
        bottomPanel = new HBox();
        bottomPanel.setAlignment(Pos.CENTER);
        bottomPanel.getChildren().add(btnLeft);
        bottomPanel.getChildren().add(btnRight);

    }

    private void defineTopPanel() {
        topPanel = new HBox();
        topPanel.setAlignment(Pos.CENTER);
        topPanel.getChildren().add(label);
        topPanel.getChildren().add(label1);
    }

    private void defineMidPanel() {
        midPanel = new HBox();
        midPanel.setAlignment(Pos.CENTER);
        midPanel.getChildren().add(btnAccelerate);
        midPanel.getChildren().add(btnBreak);
    }

    public static void main(String[] args) {
        launch(args);
    }
}