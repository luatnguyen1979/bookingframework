package asd.day11.lab13_1;

/**
 * 
 * @author luatnguyen
 *
 */
public class Node extends Composite{
	private String name;

	public Node(String name){
		super();
		this.name = name;
	}
	
	public Node(String name, Side side) {
		super();
		this.name = name;
		this.side = side;
	}
	
	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public Side getSide() {
		return side;
	}

	@Override
	public String getName() {
		return name;
	}
}
