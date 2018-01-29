package asd.day10.lab12_1;

public class Mediator implements IMediator {
	private Board board;
	private Player activePlayer;

	/**
	 * @param board
	 */
	public Mediator() {
		super();
		this.board = new Board();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day10.lab12_1.IMediator#move(asd.day10.lab12_1.Player, int, int)
	 */
	@Override
	public void moveAndMarkCells(Player player, int row, int column) {

		if (isValidCellMove(player, row, column)) {
			activePlayer = player;
			CellColor color = overGame();
			if (color == CellColor.WHITE) {
				System.out.println("White Player won!");
			} else if (color == CellColor.BLACK) {
				System.out.println("Black Player won!");
			} else {
				System.out.println("Please continue!");
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day10.lab12_1.IMediator#isValidCell(asd.day10.lab12_1.Player, int,
	 * int)
	 */
	@Override
	public boolean isValidCellMove(Player player, int row, int column) {
		if (isValidLeftAndMove(player.getCellColor(), row, column)
				|| isValidRightAndMove(player.getCellColor(), row, column) 
				|| isValidUpAndMove(player.getCellColor(), row, column)
				|| isValidDownAndMove(player.getCellColor(), row, column) 
				|| isValidLeftUpAndMove(player.getCellColor(), row, column)
				|| isValidLeftDownAndMove(player.getCellColor(), row, column)
				|| isValidRightUpAndMove(player.getCellColor(), row, column)
				|| isValidRightDownAndMove(player.getCellColor(), row, column)) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day10.lab12_1.IMediator#overGame()
	 */
	@Override
	public CellColor overGame() {
		CellColor[][] colors = board.getCellColors();
		int countWhite = 0;
		int countBlack = 0;
		for (int i = 0; i < Board.rows; i++) {
			for (int j = 0; j < Board.columns; j++) {
				if (colors[i][j] == CellColor.BLACK) {
					countBlack++;
				} else if (colors[i][j] == CellColor.WHITE) {
					countWhite++;
				} else {
					return CellColor.NONE;
				}
			}
		}
		if (countWhite > countBlack) {
			return CellColor.WHITE;
		} else
			return CellColor.BLACK;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day10.lab12_1.IMediator#displayBoard()
	 */
	@Override
	public Board displayBoard() {
		CellColor[][] colors = board.getCellColors();
		for (int i = 0; i < Board.rows; i++) {
			for (int j = 0; j < Board.columns; j++) {
				System.out.print(
						colors[i][j] == CellColor.BLACK ? "B  " : colors[i][j] == CellColor.WHITE ? "W  " : "N  ");
			}
			System.out.println();
		}
		System.out.println();
		return null;
	}

	private boolean isValidLeftAndMove(CellColor color, int row, int column) {
		boolean isExpectColor = false;
		CellColor[][] cellColors = board.getCellColors();
		if (isWithinBoard(row, column) && cellColors[row][column] == CellColor.NONE && column > 1) {

			for (int i = column - 1; i > -1; i--) {
				if (cellColors[row][i] == getExpectedColor(color)) {
					cellColors[row][i] = color;
					displayBoard();
					isExpectColor = true;
				} else {
					if (cellColors[row][i] == color && isExpectColor) {
						cellColors[row][column] = color;
						board.setCellColors(cellColors);
						return true;
					} else {
						return false;
					}
				}

			}
		}
		return false;
	}

	private boolean isValidRightAndMove(CellColor color, int row, int column) {
		boolean isExpectColor = false;
		CellColor[][] cellColors = board.getCellColors();
		if (isWithinBoard(row, column) && cellColors[row][column] == CellColor.NONE && column < Board.columns - 2) {

			for (int i = column + 1; i < Board.columns - 2; i++) {
				if (cellColors[row][i] == getExpectedColor(color)) {
					cellColors[row][i] = color;
					isExpectColor = true;
				} else {
					if (cellColors[row][i] == color && isExpectColor) {
						cellColors[row][column] = color;
						board.setCellColors(cellColors);
						return true;
					} else {
						return false;
					}
				}

			}
		}
		return false;
	}

	private boolean isValidUpAndMove(CellColor color, int row, int column) {
		boolean isExpectColor = false;
		CellColor[][] cellColors = board.getCellColors();
		if (isWithinBoard(row, column) && cellColors[row][column] == CellColor.NONE && row > 1) {

			for (int i = row - 1; i > -1; i--) {
				if (cellColors[i][column] == getExpectedColor(color)) {
					cellColors[i][column] = color;
					isExpectColor = true;
				} else {
					if (cellColors[i][column] == color && isExpectColor) {
						cellColors[row][column] = color;
						board.setCellColors(cellColors);
						return true;
					} else {
						return false;
					}
				}

			}
		}
		return false;
	}

	private boolean isValidDownAndMove(CellColor color, int row, int column) {
		boolean isExpectColor = false;
		CellColor[][] cellColors = board.getCellColors();
		if (isWithinBoard(row, column) && cellColors[row][column] == CellColor.NONE && row < Board.rows - 2) {
			for (int i = row + 1; i < Board.rows - 2; i++) {
				if (cellColors[i][column] == getExpectedColor(color)) {
					cellColors[i][column] = color;
					isExpectColor = true;
				} else {
					if (cellColors[i][column] == color && isExpectColor) {
						cellColors[row][column] = color;
						board.setCellColors(cellColors);
						return true;
					} else {
						return false;
					}
				}

			}
		}
		return false;
	}

	private boolean isValidRightDownAndMove(CellColor color, int row, int column) {
		boolean isExpectColor = false;
		CellColor[][] cellColors = board.getCellColors();
		if (isWithinBoard(row, column) && cellColors[row][column] == CellColor.NONE && row < Board.rows - 2
				&& column < Board.columns - 2) {
			int i = row + 1;
			int j = column + 1;
			for (; i > -1 && j < Board.columns - 2; i--, j++) {
				if (cellColors[i][j] == getExpectedColor(color)) {
					cellColors[i][j] = color;
					isExpectColor = true;
				} else {
					if (cellColors[i][j] == color && isExpectColor) {
						cellColors[row][column] = color;
						board.setCellColors(cellColors);
						return true;
					} else {
						return false;
					}
				}

			}
		}
		return false;
	}

	private boolean isValidLeftUpAndMove(CellColor color, int row, int column) {
		boolean isExpectColor = false;
		CellColor[][] cellColors = board.getCellColors();
		if (isWithinBoard(row, column) && cellColors[row][column] == CellColor.NONE && row > 1 && column > 1) {
			int i = row - 1;
			int j = column - 1;
			for (; i > -1 && j > -1; i--, j--) {
				if (cellColors[i][j] == getExpectedColor(color)) {
					cellColors[i][j] = color;
					isExpectColor = true;
				} else {
					if (cellColors[i][j] == color && isExpectColor) {
						cellColors[row][column] = color;
						board.setCellColors(cellColors);
						return true;
					} else {
						return false;
					}
				}

			}
		}
		return false;
	}

	private boolean isValidRightUpAndMove(CellColor color, int row, int column) {
		boolean isExpectColor = false;
		CellColor[][] cellColors = board.getCellColors();
		if (isWithinBoard(row, column) && cellColors[row][column] == CellColor.NONE && row > 1
				&& column < Board.columns - 2) {
			int i = row - 1;
			int j = column + 1;
			for (; i > 1 && j < Board.columns - 2; i--, j++) {
				if (cellColors[i][j] == getExpectedColor(color)) {
					cellColors[i][j] = color;
					isExpectColor = true;
				} else {
					if (cellColors[i][j] == color && isExpectColor) {
						cellColors[row][column] = color;
						board.setCellColors(cellColors);
						return true;
					} else {
						return false;
					}
				}

			}
		}
		return false;
	}

	private boolean isValidLeftDownAndMove(CellColor color, int row, int column) {
		boolean isExpectColor = false;
		CellColor[][] cellColors = board.getCellColors();
		if (isWithinBoard(row, column) && cellColors[row][column] == CellColor.NONE && row < Board.rows - 2
				&& column > 1) {
			int i = row + 1;
			int j = column - 1;
			for (; i < Board.rows - 2 && j > -1; i++, j--) {
				if (cellColors[i][j] == getExpectedColor(color)) {
					cellColors[i][j] = color;
					isExpectColor = true;
				} else {
					if (cellColors[i][j] == color && isExpectColor) {
						cellColors[row][column] = color;
						board.setCellColors(cellColors);
						return true;
					} else {
						return false;
					}
				}

			}
		}
		return false;
	}

	private boolean isWithinBoard(int row, int column) {
		if (row < 1 || row > Board.rows || column < 1 || column > Board.columns) {
			return false;
		}
		return true;
	}

	private CellColor getExpectedColor(CellColor color) {
		CellColor expectedColor = CellColor.WHITE;
		if (color == CellColor.WHITE) {
			expectedColor = CellColor.BLACK;
		} else if (color == CellColor.BLACK) {
			expectedColor = CellColor.WHITE;
		}
		return expectedColor;
	}

}
