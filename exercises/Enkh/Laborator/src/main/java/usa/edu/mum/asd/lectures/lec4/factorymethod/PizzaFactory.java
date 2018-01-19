package usa.edu.mum.asd.lectures.lec4.factorymethod;

import usa.edu.mum.asd.lectures.lec4.factorymethod.Product.Pizza;

public interface PizzaFactory {

    public Pizza createPizza(String type);
}
