package usa.edu.mum.asd.labs.lab3.templatemethod;

public class LetterProcessor extends ALetterProcessor {

    public SymmetryType defineType(char[][] content) {
        if (content[0][0] == 'V') {
            return SymmetryType.VERTICAL;
        } else if (content[0][0] == 'N') {
            return SymmetryType.NONE;
        } else {
            return SymmetryType.HORIZONTAL;
        }
    }

    public char[][] construct(char[][] content, SymmetryType type) {
        int colLen = Integer.parseInt(String.valueOf(content[1]));
        int rowLen = Integer.parseInt(String.valueOf(content[2]));
        int newColLen = Integer.parseInt(String.valueOf(content[3]));
        int newRowLen = Integer.parseInt(String.valueOf(content[4]));
        int startRow = 5;
        rowLen = rowLen + startRow;
        if (type == SymmetryType.VERTICAL) {
            return constructVertical(content, colLen, rowLen, newColLen, newRowLen, startRow);
        } else if (type == SymmetryType.HORIZONTAL) {
            return constructHorizontal(content, colLen, rowLen, newColLen, newRowLen, startRow);
        } else {
            return constructNone(content, colLen, rowLen, newColLen, newRowLen, startRow);
        }
    }

    private char[][] constructVertical(char[][] content, int colLen, int rowLen, int newColLen, int newRowLen, int startRow) {
        char[][] ret = new char[newRowLen][newColLen];
        int i, j;
        for (i = 0; i < startRow; i++) {
            for (j = 0; j < colLen; j++) {
                ret[i][j] = '-';
                ret[i][colLen * 2 - 1 - j] = '-';
            }
        }
        for (i = startRow; i < rowLen; i++) {
            for (j = 0; j < colLen; j++) {
                ret[i][j] = content[i][j];
                ret[i][colLen * 2 - 1 - j] = content[i][j];
            }
        }
        for (i = rowLen; i < newRowLen; i++) {
            for (j = 0; j < colLen; j++) {
                ret[i][j] = '-';
                ret[i][colLen * 2 - 1 - j] = '-';
            }
        }
        return ret;
    }

    private char[][] constructHorizontal(char[][] content, int colLen, int rowLen, int newColLen, int newRowLen, int startRow) {
        char[][] ret = new char[newRowLen][newColLen];
        int i, j;
        for (i = 0; i < startRow; i++) {
            for (j = 0; j < newColLen; j++) {
                ret[i][j] = '-';
            }
        }
        for (i = startRow; i < rowLen; i++) {
            for (j = 0; j < colLen; j++) {
                ret[i][j] = content[i][j];
                ret[2 * (rowLen - 1) - i][j] = content[i][j];
            }
        }
        for (i = startRow; i < rowLen; i++) {
            for (j = colLen; j < newColLen; j++) {
                ret[i][j] = '-';
                ret[2 * (rowLen - 1) - i][j] = '-';
            }
        }
        return ret;
    }

    private char[][] constructNone(char[][] content, int colLen, int rowLen, int newColLen, int newRowLen, int startRow) {
        char[][] ret = new char[newRowLen][newColLen];
        int i, j;
        for (i = 0; i < startRow; i++) {
            for (j = 0; j < newColLen; j++) {
                ret[i][j] = '-';
            }
        }
        for (i = startRow; i < rowLen; i++) {
            for (j = 0; j < colLen; j++) {
                ret[i][j] = content[i][j];
            }
        }
        for (i = startRow; i < rowLen; i++) {
            for (j = colLen; j < newColLen; j++) {
                ret[i][j] = '-';
            }
        }
        for (i = rowLen; i < newRowLen; i++) {
            for (j = 0; j < newColLen; j++) {
                ret[i][j] = '-';
            }
        }
        return ret;
    }

    public void print(char[][] content) {
        int i, j;
        int rowLen = content.length;
        int colLen = content[0].length;
        for (i = 0; i < rowLen; i++) {
            for (j = 0; j < colLen; j++) {
                System.out.print(content[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
//        char[][] content = {
//                {'V', 'E', 'R', 'T', 'I', 'C', 'A', 'L'},
//                {'5'},
//                {'1', '4'},
//                {'1', '0'},
//                {'2', '0'},
//                {'-', '-', '-', '-', '-'},
//                {'-', '-', '-', '-', '+'},
//                {'-', '-', '-', '+', '+'},
//                {'-', '-', '+', '+', '-'},
//                {'-', '-', '+', '+', '-'},
//                {'-', '+', '+', '-', '-'},
//                {'-', '+', '+', '-', '-'},
//                {'-', '+', '+', '-', '-'},
//                {'-', '+', '+', '+', '+'},
//                {'-', '+', '+', '-', '-'},
//                {'-', '+', '+', '-', '-'},
//                {'-', '+', '+', '-', '-'},
//                {'-', '+', '+', '-', '-'},
//                {'-', '+', '+', '-', '-'}};

        char[][] content = {
                {'H', 'O', 'R', 'I', 'Z', 'O', 'N', 'T', 'A', 'L'},
                {'9'},
                {'8'},
                {'1', '0'},
                {'2', '0'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '+', '+', '+', '+', '-', '-'},
                {'-', '-', '+', '+', '-', '-', '+', '+', '-'},
                {'-', '+', '+', '-', '-', '-', '-', '+', '+'},
                {'-', '+', '+', '-', '-', '-', '-', '-', '-'},
                {'-', '+', '+', '-', '-', '-', '-', '-', '-'},
                {'-', '+', '+', '-', '-', '-', '-', '-', '-'},
                {'-', '+', '+', '-', '-', '-', '-', '-', '-'},
        };
//        char[][] content = {
//                {'N', 'O', 'N', 'E'},
//                {'9'},
//                {'1', '4'},
//                {'1', '0'},
//                {'2', '0'},
//                {'-', '-', '-', '-', '-', '-', '-', '-', '-'},
//                {'-', '+', '+', '+', '+', '+', '-', '-', '-'},
//                {'-', '+', '+', '-', '-', '+', '+', '-', '-'},
//                {'-', '+', '+', '-', '-', '-', '+', '+', '-'},
//                {'-', '+', '+', '-', '-', '-', '+', '+', '-'},
//                {'-', '+', '+', '-', '-', '-', '+', '+', '-'},
//                {'-', '+', '+', '-', '-', '+', '+', '-', '-'},
//                {'-', '+', '+', '+', '+', '+', '+', '-', '-'},
//                {'-', '+', '+', '-', '-', '-', '+', '+', '-'},
//                {'-', '+', '+', '-', '-', '-', '-', '+', '+'},
//                {'-', '+', '+', '-', '-', '-', '-', '+', '+'},
//                {'-', '+', '+', '-', '-', '-', '-', '+', '+'},
//                {'-', '+', '+', '-', '-', '-', '+', '+', '-'},
//                {'-', '+', '+', '+', '+', '+', '+', '-', '-'},
//        };
        LetterProcessor letterProcessor = new LetterProcessor();
        letterProcessor.process(content);
    }
}
