package usa.edu.mum.asd.lectures.lec12.visitor;

import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<OrderItem> orderItems = new LinkedList<>();
        orderItems.add(new Book(9.0, 4));
        orderItems.add(new DVD(100.0, 4));
        orderItems.add(new Toy(100.0, 4));
        ShoppingCart shoppingCart = new ShoppingCart(orderItems);
        System.out.println(shoppingCart.calculateShippingFee());
    }
}
