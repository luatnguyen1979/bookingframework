package cooking.view.design;

import java.util.List;

import cooking.model.concrete.ObjectUtilities;
import cooking.model.concrete.Recipe;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class RecipeListController {
	@FXML
	private Accordion recipeAccordionPanel;

	@FXML
	private void initialize() {
		
//		List<Recipe> rl = ObjectUtilities.loadRecipeData();
//		for (Recipe r : rl) {
//			TitledPane tp = new TitledPane();
//			tp.setText(r.getName() + " Recipe");
//			recipeAccordionPanel.getPanes().addAll(tp);
//		}
		TitledPane[] tps = new TitledPane[5];
		GridPane grid ;
		for(int i = 0; i < 5; i++) {
			tps[i] = new TitledPane();
			//tp.setPrefHeight(100);
			grid = new GridPane();
			grid.setVgap(4);
			grid.setPadding(new Insets(5, 5, 5, 5));
			grid.add(new Label("Recipe Name: "), 0, 0);
			grid.add(new Label("We'll put the name here"), 1, 0);
			grid.add(new Label("Recipe Description: "), 0, 1);
			grid.add(new Label("We'll add description here"), 1, 1);
			grid.add(new Label("Cooking Steps: "), 0, 2);
			grid.add(new Label("annd here our steps"), 1, 2);
			
			tps[i].setContent(grid);
			tps[i].setText("Recipe " + i);

		}
		recipeAccordionPanel.getPanes().addAll(tps);

		recipeAccordionPanel.setExpandedPane(tps[0]);

	}

	void initData(List<TitledPane> acc) {
		recipeAccordionPanel.getPanes().addAll(acc);
	}
}
