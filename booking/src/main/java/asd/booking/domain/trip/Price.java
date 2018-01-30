package asd.booking.domain.trip;

import java.util.ArrayList;

public class Price {

    private Integer id;
    private Double amountOneWay;
    private Double amountRoundWay;
    private final ArrayList<Route> routes;

    public Price(Integer id, Double amountOneWay, Double amountRoundWay, ArrayList<Route> routes) {
        this.id = id;
        this.amountOneWay = amountOneWay;
        this.amountRoundWay = amountRoundWay;
        this.routes = routes;
    }

    public Double getAmountOneWay() {
        return amountOneWay;
    }

    public void setAmountOneWay(Double amountOneWay) {
        this.amountOneWay = amountOneWay;
    }

    public Double getAmountRoundWay() {
        return amountRoundWay;
    }

    public void setAmountRoundWay(Double amountRoundWay) {
        this.amountRoundWay = amountRoundWay;
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }
}
