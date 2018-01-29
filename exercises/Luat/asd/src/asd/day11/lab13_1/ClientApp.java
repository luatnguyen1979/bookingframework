package asd.day11.lab13_1;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author luatnguyen
 *
 */
public class ClientApp {
	public static void main(String[] args) {
		DisplayNodeVisitor visitor = new DisplayNodeVisitor();
		Composite tree = initTree();
		tree.accept(visitor);
		
		//Root
		System.out.println("Root Node: " + tree.getName());
		
		// Right Side
		System.out.println("\nRight Side:");
		HashMap<String, Integer> rightHashMap = visitor.getRightMap();
		for (Map.Entry<String, Integer> map : rightHashMap.entrySet()) {
			System.out.println(map.getValue() + " " + map.getKey() + " nodes");
		}

		// Left Side
		System.out.println("\nLeft Side:");
		HashMap<String, Integer> leftHashMap = visitor.getLeftMap();
		for (Map.Entry<String, Integer> map : leftHashMap.entrySet()) {
			System.out.println(map.getValue() + " " + map.getKey() + " nodes");
		}
	}

	public static Composite initTree() {
		Composite topic = new Root("Topic");
		Composite A = new Node("A", Side.RIGHT);
		Composite A1 = new Node("A1");
		Composite AA1 = new Node("AA1");
		Composite AA2 = new Node("AA2");
		Composite AA3 = new Node("AA3");
		Composite A2 = new Node("A2");
		A.addChild(A1);
		A.addChild(A2);
		A1.addChild(AA1);
		A1.addChild(AA2);
		A1.addChild(AA3);
		
		Composite B = new Node("B", Side.RIGHT);
		Composite B1 = new Node("B1");
		Composite B2 = new Node("B2");
		B.addChild(B1);
		B.addChild(B2);
		
		Composite C = new Node("C", Side.RIGHT);
		Composite C1 = new Node("C1");
		Composite C2 = new Node("C2");
		C.addChild(C1);
		C.addChild(C2);
		
		
		Composite D = new Node("D", Side.LEFT);
		Composite D1 = new Node("D1");
		Composite D2 = new Node("D2");
		D.addChild(D1);
		D.addChild(D2);
		
		Composite E = new Node("E", Side.LEFT);
		Composite E1 = new Node("E1");
		Composite E2 = new Node("E2");
		Composite E3 = new Node("E3");
		E.addChild(E1);
		E.addChild(E2);
		E.addChild(E3);
		
		Composite F = new Node("F", Side.LEFT);
		Composite F1 = new Node("F1");
		Composite F2 = new Node("F2");
		F.addChild(F1);
		F.addChild(F2);

		topic.addChild(A);
		topic.addChild(B);
		topic.addChild(C);
		topic.addChild(D);
		topic.addChild(E);
		topic.addChild(F);

		return topic;
	}
}
