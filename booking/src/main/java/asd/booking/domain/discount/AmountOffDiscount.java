package asd.booking.domain.discount;

import java.time.LocalDate;

public class AmountOffDiscount extends DiscountType {

    private Double amountOff;

    public AmountOffDiscount(LocalDate bd, LocalDate ed, Double amountOff) {
        super(bd, ed);
        this.amountOff = amountOff;
    }

    @Override
    public Double calculate(Double regularPrice) {
        return regularPrice - amountOff;
    }
}
