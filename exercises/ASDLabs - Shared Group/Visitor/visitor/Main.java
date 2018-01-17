package visitor;

public class Main {

	public static void main(String[] args){
		
		Composite nodeAA1 = new Node("AA1");
		Composite nodeAA2 = new Node("AA2");
		Composite nodeAA3 = new Node("AA3");
		
		Composite nodeA1 = new Node("A1");
		Composite nodeA2 = new Node("A2");
		
		nodeA1.addNode(nodeAA1);
		nodeA1.addNode(nodeAA2);
		nodeA1.addNode(nodeAA3);
		
		Composite nodeA = new Node("A");
		
		Root root = new Root("Topic");
		root.addRightNode(nodeA);
		
		
		
		
	}
}
