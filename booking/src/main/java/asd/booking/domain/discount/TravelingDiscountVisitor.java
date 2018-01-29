package asd.booking.domain.discount;

public class TravelingDiscountVisitor implements DiscountVisitor {

    private Double regularPricePerPassenger;
    private Double totalSave;
    private Double totalRegularPrice;

    public TravelingDiscountVisitor(Double regularPricePerPassenger) {
        this.regularPricePerPassenger = regularPricePerPassenger;
        this.totalSave = 0.0;
        this.totalRegularPrice = 0.0;
    }

    @Override
    public void visit(Adult adult) {
        totalSave = totalSave + adult.getDiscountType().getSave(regularPricePerPassenger);
        totalRegularPrice = totalRegularPrice + regularPricePerPassenger;
    }

    @Override
    public void visit(Child child) {
        totalSave = totalSave + child.getDiscountType().getSave(regularPricePerPassenger);
        totalRegularPrice = totalRegularPrice + regularPricePerPassenger;
    }

    @Override
    public void visit(Senior senior) {
        totalSave = totalSave + senior.getDiscountType().getSave(regularPricePerPassenger);
        totalRegularPrice = totalRegularPrice + regularPricePerPassenger;
    }

    @Override
    public void visit(Infant infant) {
        totalSave = totalSave + infant.getDiscountType().getSave(regularPricePerPassenger);
        totalRegularPrice = totalRegularPrice + regularPricePerPassenger;
    }

    public Double getTotalSave() {
        return totalSave;
    }

    public Double getTotalPrice() {
        Double ret = totalRegularPrice - totalSave;
        if (ret < 0) ret = 0.0;
        if (ret > totalRegularPrice) ret = totalRegularPrice;
        return ret;
    }
}
