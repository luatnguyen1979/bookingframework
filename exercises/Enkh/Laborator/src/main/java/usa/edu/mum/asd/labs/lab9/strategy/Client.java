package usa.edu.mum.asd.labs.lab9.strategy;

import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Flight> flightList = new LinkedList<>();
        Flight flight1 = new Flight(null, 150);
        Flight flight2 = new Flight(null, 250);
        Flight flight3 = new Flight(null, 350);
        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        RevenueStrategy strategy = new RevenueStrategy(50000.0, 300.0);
        strategy.setChosenStrategy(flightList);
        System.out.println(strategy.getRevenue());
        System.out.println(strategy.getChosenStrategy());
    }
}
