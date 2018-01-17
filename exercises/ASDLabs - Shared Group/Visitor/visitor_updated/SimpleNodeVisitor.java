package visitor;

import java.util.List;

public class SimpleNodeVisitor implements NodeVisitor {

	private int countA, countB, countC, countD, countE, countF;

	@Override
	public void visit(Root root) {
		System.out.println(root.getName());
		List<Composite> leftNodes = root.getLeftNodes();
		List<Composite> rightNodes = root.getRightNodes();
		System.out.println("Right nodes::");
		for (Composite composite : rightNodes) {
			composite.accept(this);
		}
		System.out.println("Left nodes::");
		for (Composite composite : leftNodes) {
			composite.accept(this);
		}
	}

	@Override
	public void visit(Node node) {
		String name = node.getName();
		System.out.println(name);

		if (name.contains("A")) {
			countA++;
		} else if (name.contains("B")) {
			countB++;
		} else if (name.contains("C")) {
			countC++;
		} else if (name.contains("D")) {
			countD++;
		} else if (name.contains("E")) {
			countE++;
		} else if (name.contains("F")) {
			countF++;
		}

		List<Composite> childNodes = node.getNodes();

		for (Composite composite : childNodes) {
			composite.accept(this);
		}
	}

	public void printVisitResults() {
		System.out.println(countA + "A nodes");
		System.out.println(countB + "B nodes");
		System.out.println(countC + "C nodes");
		System.out.println(countD + "D nodes");
		System.out.println(countE + "E nodes");
		System.out.println(countF + "F nodes");
	}

}
