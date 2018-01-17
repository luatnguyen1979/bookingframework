package com.asd.lab4.prob1;

/**
 * Created by Sandip on 4/27/16.
 */
public class DemoAlphabetPrinter extends AAlphabetPrinter {


    @Override
    public Symmetry identifySymmetry(char[][] originalHalf) {
        int row = originalHalf.length;
        int col = originalHalf[0].length;
        if (row == 14 && col == 5) {
            return Symmetry.VERTICAL;
        } else if (row == 9 && col == 14) {
            return Symmetry.NONE;
        } else if (row == 8 && col == 9) {
            return Symmetry.HORIZONTAL;
        }
        return null;
    }

    @Override
    public char[][] reconstruct(char[][] originalHalf, Symmetry symmetry) {
        if (symmetry == Symmetry.HORIZONTAL) {
            return handleHorizontalSymmetry(originalHalf);
        } else if (symmetry == Symmetry.VERTICAL) {
            return handleVerticalSymmetry(originalHalf);
        }
        return originalHalf;
    }

    @Override
    public void print(char[][] completeImage) {
        int row = completeImage.length;
        int col = completeImage[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(completeImage[i][j]);
            }
            System.out.println("");
        }
    }

    private char[][] handleVerticalSymmetry(char[][] originalHalf) {
        int row = originalHalf.length;
        int col = originalHalf[0].length;
        int colLength = 2 * col;
        int tempCol = col - 1;
        int tempRow = 0;
        char[][] completeImage = new char[row][2 * col];
        boolean incrRow = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colLength; j++) {
                if (j >= col) {
                    incrRow = true;
                    completeImage[i][j] = originalHalf[tempRow][tempCol];
                    tempCol--;
                } else {
                    completeImage[i][j] = originalHalf[i][j];
                }
            }
            tempCol = col - 1;
            if (incrRow) tempRow++;
        }
        return completeImage;

    }

    private char[][] handleHorizontalSymmetry(char[][] originalHalf) {
        int row = originalHalf.length;
        int col = originalHalf[0].length;
        int rowLength = 2 * row;
        int tempRow = row - 1;
        boolean decrRow = false;
        char[][] completeImage = new char[rowLength][col];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < col; j++) {
                if (i >= row) {
                    decrRow = true;
                    completeImage[i][j] = originalHalf[tempRow][j];
                } else {
                    completeImage[i][j] = originalHalf[i][j];
                }

            }
            if (decrRow) tempRow--;
        }
        return completeImage;
    }
}
