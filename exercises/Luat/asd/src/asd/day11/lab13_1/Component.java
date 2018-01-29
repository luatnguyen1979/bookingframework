package asd.day11.lab13_1;

/**
 * 
 * @author luatnguyen
 *
 */
public interface Component {
	public void accept(NodeVisitor visitor);
	public Side getSide();
}
