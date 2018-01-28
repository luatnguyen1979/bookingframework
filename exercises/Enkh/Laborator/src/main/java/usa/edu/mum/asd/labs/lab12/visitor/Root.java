package usa.edu.mum.asd.labs.lab12.visitor;

public class Root extends Composite {

    private final Side side;
    private final String name;

    public Root(String name) {
        this.side = Side.NONE;
        this.name = name;
    }

    @Override
    public Side getSide() {
        return side;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}
