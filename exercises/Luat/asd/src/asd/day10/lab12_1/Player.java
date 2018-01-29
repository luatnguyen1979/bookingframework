/**
 * 
 */
package asd.day10.lab12_1;

/**
 * @author luatnguyen
 *
 */
public abstract class Player {
	protected IMediator mediator;
	protected CellColor cellColor;

	/**
	 * @param mediator
	 */
	public Player(IMediator mediator) {
		super();
		this.mediator = mediator;
	}

	public CellColor getCellColor() {
		return this.cellColor;
	}

	public abstract void move(int row, int column);
}
