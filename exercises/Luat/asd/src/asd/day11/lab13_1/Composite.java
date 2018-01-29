package asd.day11.lab13_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author luatnguyen
 *
 */
public abstract class Composite implements Component {
	protected List<Composite> childs;
	protected Side side = Side.NONE;

	public Composite() {
		childs = new ArrayList<>();
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public void addChild(Composite node) {
		if (this.side != Side.NONE)
			node.setSide(this.side);

		childs.add(node);
	}

	public List<Composite> getChilds() {
		return childs;
	}

	public abstract String getName();

}
