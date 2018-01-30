package asd.booking.domain.discount.calculation;

import java.time.LocalDate;

public class CalculationByPercentage extends Calculation {

    private Double percentageOff;

    public CalculationByPercentage(Integer id, LocalDate bd, LocalDate ed, Double percentageOff) {
        super(id, bd, ed);
        this.percentageOff = percentageOff;
    }

    @Override
    public Double calculate(Double regularPrice) {
        return regularPrice / 100 * percentageOff;
    }
}
