/**
 * 
 */
package asd.day10.lab12_1;

/**
 * @author luatnguyen
 *
 */
public class WhitePlayer extends Player {

	public WhitePlayer(IMediator mediator) {
		super(mediator);
		this.cellColor = CellColor.WHITE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day10.lab12_1.Player#move(int, int)
	 */
	@Override
	public void move(int row, int column) {
		this.mediator.moveAndMarkCells(this, row, column);

	}

}
