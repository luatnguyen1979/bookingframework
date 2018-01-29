package asd.booking.domain.discount;

public class Passenger {

    private DiscountType discountType;
    private String name;
    private String description;
    private byte fromAge;
    private byte toAge;

    public Passenger(DiscountType discountType, String name, String description, byte fromAge, byte toAge) {
        this.discountType = discountType;
        this.name = name;
        this.description = description;
        this.fromAge = fromAge;
        this.toAge = toAge;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public void setDiscountType(DiscountType discountType) {
        this.discountType = discountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getFromAge() {
        return fromAge;
    }

    public void setFromAge(byte fromAge) {
        this.fromAge = fromAge;
    }

    public byte getToAge() {
        return toAge;
    }

    public void setToAge(byte toAge) {
        this.toAge = toAge;
    }
}
