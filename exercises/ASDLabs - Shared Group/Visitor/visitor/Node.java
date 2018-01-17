package visitor;

import java.util.ArrayList;
import java.util.List;

public class Node extends Composite{
	
	private Side side;
	String name;
	private List<Composite> nodes;
	
	public Node(String name){
		this.name = name;
		nodes = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	
	@Override
	public void setSide(Side side){
		this.side = side;
		for (Composite composite : nodes) {
			composite.setSide(side);
		}
	}
	
	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
		
	}

	@Override
	public void addNode(Composite composite) {
		nodes.add(composite);
		
	}

}
