/**
 * 
 */
package asd.day10.lab12_1;

/**
 * @author luatnguyen
 *
 */
public class BlackPlayer extends Player {

	public BlackPlayer(IMediator mediator) {
		super(mediator);
		this.cellColor = cellColor.BLACK;
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
