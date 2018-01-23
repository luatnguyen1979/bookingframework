package usa.edu.mum.asd.lectures.lec7.builder;

import usa.edu.mum.asd.lectures.lec7.builder.mealparts.Drink;
import usa.edu.mum.asd.lectures.lec7.builder.mealparts.MainDish;
import usa.edu.mum.asd.lectures.lec7.builder.mealparts.SideDish;

public class Meal {

    private String name;
    private Drink drink;
    private MainDish mainDish;
    private SideDish sideDish;

    public Meal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public MainDish getMainDish() {
        return mainDish;
    }

    public void setMainDish(MainDish mainDish) {
        this.mainDish = mainDish;
    }

    public SideDish getSideDish() {
        return sideDish;
    }

    public void setSideDish(SideDish sideDish) {
        this.sideDish = sideDish;
    }
}