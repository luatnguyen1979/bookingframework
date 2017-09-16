package cooking.view.design;

import java.util.List;

import cooking.model.concrete.NutritionFact;
import cooking.model.concrete.ObjectUtilities;
import cooking.model.concrete.Recipe;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;

public class RecipeListController {
	@FXML	private Accordion recipeAccordionPanel;
	@FXML	private TableView<NutritionFact> tbl_nutrition;

	@FXML
	private void initialize() {
		initData();		
	}

	void initData() {
		populateAccordion();
		populateTableView();
	}

	private void populateTableView() {
		// TODO Auto-generated method stub
		
	}

	private void populateAccordion() {
		// TODO Auto-generated method stub
		GridPane grid;
		List<Recipe> rl = ObjectUtilities.loadRecipeData();
		TitledPane[] tps = new TitledPane[rl.size()];
		int i = 0;

		for (Recipe r : rl) {
			tps[i] = new TitledPane();
			grid = new GridPane();
			grid.setVgap(6);
			grid.setPadding(new Insets(5, 5, 5, 5));
			grid.add(new Label("Recipe Name: "), 0, 0);
			grid.add(new Label(r.getName()), 1, 0);
			
			grid.add(new Label("Recipe Description: "), 0, 1);
			grid.add(new Label(r.getDescription()), 1, 1);

			
			grid.add(new Label("Cooking Steps: "), 0, 2);
			grid.add(new Label(r.getDescription()), 1, 2);
			
			grid.add(new Button("Modify"), 1, 3);
			
			Button btn_delete = new Button("Delete");
			btn_delete.la
			grid.add(btn_delete, 1, 3);
			tps[i].setText(r.getName() + " Recipe");
			tps[i].setContent(grid);
			i++;
		}
		recipeAccordionPanel.getPanes().addAll(tps);
	}
}
