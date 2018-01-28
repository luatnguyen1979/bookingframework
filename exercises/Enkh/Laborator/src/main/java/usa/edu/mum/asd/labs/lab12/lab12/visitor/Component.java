package usa.edu.mum.asd.labs.lab12.lab12.visitor;

public interface Component {

    public Side getSide();

    public String getName();

    public void accept(NodeVisitor nodeVisitor);
}
