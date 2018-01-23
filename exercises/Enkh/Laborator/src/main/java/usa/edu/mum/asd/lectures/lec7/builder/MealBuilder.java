package usa.edu.mum.asd.lectures.lec7.builder;

public interface MealBuilder {

    public void buildDrink();

    public void buildMainDish();

    public void buildSideDish();

    public Meal getMeal();
}