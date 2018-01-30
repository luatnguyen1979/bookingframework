package asd.booking.domain.discount.calculation;

import java.time.LocalDate;

public class CalculationByAmount extends Calculation {

    private Double amountOff;

    public CalculationByAmount(LocalDate bd, LocalDate ed, Double amountOff) {
        super(bd, ed);
        this.amountOff = amountOff;
    }

    @Override
    public Double calculate(Double regularPrice) {
        return regularPrice - amountOff;
    }
}
