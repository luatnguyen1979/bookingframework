package asd.booking.domain.discount;

public interface DiscountVisitor {

    public void visit(Adult adult);

    public void visit(Child child);

    public void visit(Senior senior);

    public void visit(Infant infant);

}
