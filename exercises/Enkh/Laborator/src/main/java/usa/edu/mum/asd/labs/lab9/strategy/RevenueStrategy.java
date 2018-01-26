package usa.edu.mum.asd.labs.lab9.strategy;

import java.util.LinkedList;
import java.util.List;

public class RevenueStrategy {

    private List<Model> strategyList;
    private Double revenue;
    private Model chosenStrategy;
    private Double cost;
    private Double pricePerSeat;

    public RevenueStrategy(Double cost, Double pricePerSeat) {
        this.strategyList = new LinkedList<>();
        this.strategyList.add(new SingleClass());
        this.strategyList.add(new MultiClasses());
        this.strategyList.add(new TwoClasses());
        this.cost = cost;
        this.pricePerSeat = pricePerSeat;
    }

    public Double getRevenue() {
        return revenue;
    }

    public Model getChosenStrategy() {
        return chosenStrategy;
    }

    public void setChosenStrategy(List<Flight> flightList) {
        Double max = 0.0;
        Double temp = 0.0;
        for (Model model : strategyList) {
            temp = model.getRevenue(flightList, cost, pricePerSeat);
            if (max < temp) {
                max = temp;
                chosenStrategy = model;
            }
        }
        revenue = max;
    }
}
