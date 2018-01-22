package usa.edu.mum.asd.labs.lab5.command;

import java.util.Stack;

public class Square {

    private final Stack<Operation> executedOperations;
    private final int len;
    private char[][] matrix;
    private boolean isCreated;
    private int position;
    private int size;

    public Square(int len) {
        this.matrix = new char[len][len];
        this.isCreated = false;
        this.position = 0;
        this.executedOperations = new Stack<>();
        this.len = len;
    }

    boolean create(int newSize) {
        if (isCreated) return false;
        if (size > len) return false;
        this.size = newSize;
        fillBlank();
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = position; j < position + size; j++) {
                matrix[i][j] = '+';
            }
        }
        isCreated = true;
        System.out.println("A square is created by size=" + size);
        show();
        executedOperations.push(new Operation(matrix, position, size));
        return true;
    }

    boolean scale(int rate) {
        if (!isCreated) return false;
        if (position + (size * rate) > len) return false;
        fillBlank();
        int i, j;
        size = size * rate;
        for (i = 0; i < size; i++) {
            for (j = position; j < position + size; j++) {
                matrix[i][j] = '+';
            }
        }
        System.out.println("A square is scaled by rate=" + rate);
        show();
        executedOperations.push(new Operation(matrix, position, size));
        return true;
    }

    boolean move(int distance) {
        if (!isCreated) return false;
        if (position + distance + size > len) return false;
        fillBlank();
        int i, j;
        position = position + distance;
        for (i = 0; i < size; i++) {
            for (j = position; j < position + size; j++) {
                matrix[i][j] = '+';
            }
        }
        System.out.println("A square is moved by distance=" + distance);
        show();
        executedOperations.push(new Operation(matrix, position, size));
        return true;
    }

    boolean undo() {
        if (executedOperations.isEmpty()) return false;
        Operation last = executedOperations.pop();
        last = executedOperations.pop();
        matrix = last.getMatrix();
        position = last.getPosition();
        size = last.getSize();
        System.out.println("Last operation is rolled back.");
        show();
        return true;
    }

    private void show() {
        if (!isCreated) return;
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private void fillBlank() {
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                matrix[i][j] = '.';
            }
        }
    }

    private class Operation {

        private final char[][] matrix;
        private final int position;
        private final int size;

        public Operation(char[][] matrix, int position, int size) {
            this.matrix = cloneMatrix(matrix);
            this.position = position;
            this.size = size;
        }

        public char[][] getMatrix() {
            return matrix;
        }

        public int getPosition() {
            return position;
        }

        public int getSize() {
            return size;
        }

        public char[][] cloneMatrix(char[][] matrix) {
            int copyLen = matrix.length;
            char[][] ret = new char[copyLen][copyLen];
            int i, j;
            for (i = 0; i < copyLen; i++) {
                for (j = 0; j < copyLen; j++) {
                    ret[i][j] = matrix[i][j];
                }
            }
            return ret;
        }
    }
}
