/**
 * 
 */
package asd.day10.lab12_1;

/**
 * @author luatnguyen
 *
 */
public class Board {
	public static final int rows = 8;
	public static final int columns = 8;
	private CellColor[][] cellColors;

	/**
	 * 
	 */
	public Board() {
		this.cellColors = new CellColor[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				cellColors[i][j] = CellColor.NONE;
			}
		}
		this.cellColors[3][3] = CellColor.BLACK;
		this.cellColors[3][4] = CellColor.BLACK;
		this.cellColors[4][3] = CellColor.WHITE;
		this.cellColors[4][4] = CellColor.BLACK;
		this.cellColors[4][2] = CellColor.BLACK;
		this.cellColors[4][1] = CellColor.WHITE;
		this.cellColors[4][3] = CellColor.WHITE;
		this.cellColors[4][0] = CellColor.BLACK;
	}

	/**
	 * @return the cellColors
	 */
	public CellColor[][] getCellColors() {
		return cellColors;
	}

	/**
	 * @param cellColors
	 *            the cellColors to set
	 */
	public void setCellColors(CellColor[][] cellColors) {
		this.cellColors = cellColors;
	}

	public CellColor getCellColor(int row, int column) {
		return this.cellColors[row][column];
	}

	public void setCellColor(int row, int column, CellColor cellColor) {
		this.cellColors[row][column] = cellColor;
	}

}
