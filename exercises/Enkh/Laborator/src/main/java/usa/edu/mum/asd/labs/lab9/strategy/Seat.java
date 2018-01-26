package usa.edu.mum.asd.labs.lab9.strategy;

public class Seat {

    private final Double amount;
    private final int number;
    private final String type;

    public Seat(Double amount, int number, String type) {
        this.amount = amount;
        this.number = number;
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }
}
