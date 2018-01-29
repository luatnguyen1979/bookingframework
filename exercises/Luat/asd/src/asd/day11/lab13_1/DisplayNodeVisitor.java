package asd.day11.lab13_1;

import java.util.HashMap;

/**
 * 
 * @author luatnguyen
 *
 */
public class DisplayNodeVisitor implements NodeVisitor {
	private HashMap<String, Integer> rightMap;
	private HashMap<String, Integer> leftMap;

	private Composite currentNode;

	public DisplayNodeVisitor() {
		rightMap = new HashMap<>();
		leftMap = new HashMap<>();
	}

	public HashMap<String, Integer> getRightMap() {
		return rightMap;
	}

	public HashMap<String, Integer> getLeftMap() {
		return leftMap;
	}

	@Override
	public void visit(Root root) {
		for (Composite node : root.getChilds()) {
			currentNode = node;
			if (node.getSide() == Side.RIGHT) {
				rightMap.put(node.getName(), 1);
				for (Composite childNode : node.getChilds()) {
					childNode.accept(this);
				}
			} else if (node.getSide() == Side.LEFT) {
				leftMap.put(node.getName(), 1);
				for (Composite childNode : node.getChilds()) {
					childNode.accept(this);
				}
			}
		}
	}

	@Override
	public void visit(Node node) {
		if (node.getSide() == Side.RIGHT) {
			rightMap.put(currentNode.getName(), rightMap.get(currentNode.getName()) + 1);
		}
		if (node.getSide() == Side.LEFT) {
			leftMap.put(currentNode.getName(), leftMap.get(currentNode.getName()) + 1);
		}
		for (Composite childNode : node.getChilds()) {
			childNode.accept(this);
		}
	}

}
