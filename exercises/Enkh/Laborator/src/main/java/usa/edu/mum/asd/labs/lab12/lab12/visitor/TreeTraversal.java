package usa.edu.mum.asd.labs.lab12.lab12.visitor;

public class TreeTraversal {

    private DisplayNodeVisitor displayNodeVisitor = new DisplayNodeVisitor();

    public void display(Composite node) {
        traverse(node);
        displayNodeVisitor.print();
    }

    private void traverse(Composite node) {
        node.accept(displayNodeVisitor);
        for (Composite composite : node.getCompositeList()) {
            traverse(composite);
        }
    }
}
