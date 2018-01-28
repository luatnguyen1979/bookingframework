package usa.edu.mum.asd.labs.lab12.visitor;

public interface NodeVisitor {

    public void visit(Node node);

    public void visit(Root root);
}
