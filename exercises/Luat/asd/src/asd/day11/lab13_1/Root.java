package asd.day11.lab13_1;

/**
 * 
 * @author luatnguyen
 *
 */
public class Root extends Composite{
	
	private String name;

	public Root(String name) {
		super();
		this.name = name;
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
