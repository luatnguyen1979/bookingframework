package usa.edu.mum.asd.lectures.lec4.factorymethod;

import usa.edu.mum.asd.lectures.lec4.factorymethod.Product.CheesePizza;
import usa.edu.mum.asd.lectures.lec4.factorymethod.Product.Pizza;

public class Client {

    public static void main(String[] args) {
        PizzaFactory factory = SimplePizzaFactory.getFactory();
        Pizza pizza = factory.createPizza("cheese");
        //different from below on when the decision has to be made - runtime or compile time?
        //which is one difference between framework and application development
        Pizza pizza1 = new CheesePizza();
        System.out.println(pizza.getClass().getSimpleName());
    }
}