package asd.booking.domain.promotion;

import java.util.List;

public class Promotion {

    private Integer id;
    private Double amount;
    private String code;
    private Byte status;
    private List<Condition> conditionList;

    public Promotion(Integer id, Double amount, String code, Byte status, List<Condition> conditionList) {
        this.id = id;
        this.amount = amount;
        this.code = code;
        this.status = status;
        this.conditionList = conditionList;
    }

    public Integer getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public String getCode() {
        return code;
    }

    public Byte getStatus() {
        return status;
    }

    public List<Condition> getConditionList() {
        return conditionList;
    }
}
