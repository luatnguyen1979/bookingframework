package asd.booking.domain.discount;

import java.time.LocalDate;

public class PercentageOffDiscount extends DiscountType {

    private Double percentageOff;

    public PercentageOffDiscount(LocalDate bd, LocalDate ed, Double percentageOff) {
        super(bd, ed);
        this.percentageOff = percentageOff;
    }

    @Override
    public Double calculate(Double regularPrice) {
        return regularPrice / 100 * percentageOff;
    }
}
