package usa.edu.mum.asd.labs.lab12.visitor;

public class Client {

    public static void main(String[] args) {
        Root root = new Root("Topic");

        Node nodeA = new Node(Side.RIGHT, "A");
        Node nodeA1 = new Node(Side.RIGHT, "A1");
        Node nodeA2 = new Node(Side.RIGHT, "A2");
        Node nodeAA1 = new Node(Side.RIGHT, "AA1");
        Node nodeAA2 = new Node(Side.RIGHT, "AA2");
        Node nodeAA3 = new Node(Side.RIGHT, "AA3");
        nodeA1.addComponent(nodeAA1);
        nodeA1.addComponent(nodeAA2);
        nodeA1.addComponent(nodeAA3);
        nodeA.addComponent(nodeA1);
        nodeA.addComponent(nodeA2);

        Node nodeB = new Node(Side.RIGHT, "B");
        Node nodeB1 = new Node(Side.RIGHT, "B1");
        Node nodeB2 = new Node(Side.RIGHT, "B2");
        nodeB.addComponent(nodeB1);
        nodeB.addComponent(nodeB2);

        Node nodeC = new Node(Side.RIGHT, "C");
        Node nodeC1 = new Node(Side.RIGHT, "C1");
        Node nodeC2 = new Node(Side.RIGHT, "C2");
        nodeC.addComponent(nodeC1);
        nodeC.addComponent(nodeC2);

        root.addComponent(nodeA);
        root.addComponent(nodeB);
        root.addComponent(nodeC);

        Node nodeD = new Node(Side.LEFT, "D");
        Node nodeD1 = new Node(Side.LEFT, "D1");
        Node nodeD2 = new Node(Side.LEFT, "D2");
        nodeD.addComponent(nodeD1);
        nodeD.addComponent(nodeD2);

        Node nodeE = new Node(Side.LEFT, "E");
        Node nodeE1 = new Node(Side.LEFT, "E1");
        Node nodeE2 = new Node(Side.LEFT, "E2");
        nodeE.addComponent(nodeE1);
        nodeE.addComponent(nodeE2);

        Node nodeF = new Node(Side.LEFT, "F");
        Node nodeF1 = new Node(Side.LEFT, "F1");
        Node nodeF2 = new Node(Side.LEFT, "F2");
        nodeF.addComponent(nodeF1);
        nodeF.addComponent(nodeF2);

        root.addComponent(nodeD);
        root.addComponent(nodeE);
        root.addComponent(nodeF);

        TreeTraversal treeTraversal = new TreeTraversal();
        treeTraversal.display(root);
    }
}
