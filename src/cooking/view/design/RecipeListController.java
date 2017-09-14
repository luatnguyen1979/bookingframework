package cooking.view.design;

import java.util.List;

import cooking.model.concrete.ObjectUtilities;
import cooking.model.concrete.Recipe;
import javafx.fxml.FXML;

import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;

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
		
		for(int i = 0; i < 5; i++) {
			TitledPane tp = new TitledPane();
			tp.setText("Recipe " + i);
			recipeAccordionPanel.getPanes().addAll(tp);
		}

	}

	void initData(List<TitledPane> acc) {
		recipeAccordionPanel.getPanes().addAll(acc);
	}
}
