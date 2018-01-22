package usa.edu.mum.asd.quizzes.quiz5;

public enum Coin {

    DOLLAR(1.00),
    QUARTER(0.25),
    DIME(0.10),
    NICKLE(0.05),
    PENNY(0.01);

    private final double amount;

    private Coin(Double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
