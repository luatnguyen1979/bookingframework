/**
 * 
 */
package asd.day10.lab12_1;

/**
 * @author luatnguyen
 *
 */
public interface IMediator {
	public void moveAndMarkCells(Player player, int row, int column);

	public boolean isValidCellMove(Player player, int row, int column);

	public CellColor overGame();

	public Board displayBoard();

}
