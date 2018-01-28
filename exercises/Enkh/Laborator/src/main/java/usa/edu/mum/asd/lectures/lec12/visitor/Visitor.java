package usa.edu.mum.asd.lectures.lec12.visitor;

public interface Visitor {

    public void visit(Book book);

    public void visit(DVD dvd);

    public void visit(Toy toy);
}