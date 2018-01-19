/**
 * 
 */
package asd.day3.lab41;

/**
 * @author luatnguyen
 *
 */
public class AlphabetsPrinting extends ALargeAlphabets {
	// The maximum columns of full matrix of character
	private final static int MAX_COLS = 9;

	// The maximum rows of full matrix of character
	private final static int MAX_ROWS = 14;

	// This one is used to identify the vertical symmetry
	private final static int VERTICAL_COLS = 5;

	// This one is used to identify the horizontal symmetry
	private final static int HORIZONTAL_ROWS = 8;

	@Override
	public Symmetry identifySymmetryType(char[][] content) {
		if (content.length == MAX_ROWS && content[0].length == VERTICAL_COLS) {
			return Symmetry.VERTICAL;
		} else if (content.length == HORIZONTAL_ROWS && content[0].length == MAX_COLS) {
			return Symmetry.HORIZONTAL;
		} else if (content.length == MAX_ROWS && content[0].length == MAX_COLS) {
			return Symmetry.NONE;
		}
		return null;
	}

	@Override
	public char[][] reconstructLetter(char[][] content, Symmetry symmetry) {
		if (Symmetry.HORIZONTAL == symmetry) {
			return reconstructHorizontalLetter(content);
		} else if (Symmetry.VERTICAL == symmetry) {
			return reconstructVerticalLetter(content);
		} else if (Symmetry.NONE == symmetry) {
			return content;
		}
		return null;
	}

	@Override
	public void printCharater(char[][] content) {
		for (int i = 0; i < content.length; i++) {
			for (int j = 0; j < content[0].length; j++) {
				System.out.print(content[i][j]);
			}
			System.out.println();
		}
	}

	private char[][] reconstructVerticalLetter(char[][] content) {
		char[][] newContent = new char[MAX_ROWS][MAX_COLS];
		for (int i = 0; i < MAX_ROWS; i++) {
			for (int j = 0; j < MAX_COLS; j++) {
				if (j < VERTICAL_COLS) {
					newContent[i][j] = content[i][j];
				} else {
					newContent[i][j] = content[i][MAX_COLS - j - 1];
				}
			}
		}
		return newContent;
	}

	private char[][] reconstructHorizontalLetter(char[][] content) {
		char[][] newContent = new char[MAX_ROWS][MAX_COLS];
		for (int i = 0; i < MAX_ROWS; i++) {
			for (int j = 0; j < MAX_COLS; j++) {
				if (i < HORIZONTAL_ROWS) {
					newContent[i][j] = content[i][j];
				} else {
					newContent[i][j] = content[MAX_ROWS - i - 1][j];
				}
			}
		}
		return newContent;
	}

}
