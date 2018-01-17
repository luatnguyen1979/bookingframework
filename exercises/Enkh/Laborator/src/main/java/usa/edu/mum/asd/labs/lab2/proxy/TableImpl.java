package usa.edu.mum.asd.labs.lab2.proxy;

public class TableImpl implements ITable {

    private int end = -1;
    private IRow[] rows = new IRow[100];

    public int numOfRows() {
        return 100;
    }

    public IRow getRow(int rowNum) {
        return rows[rowNum];
    }

    public void addRow(IRow row, int rowNum) {
        end++;
        rows[end] = row;
    }

    public void modifyRow(int rowNum, IRow row) {
        rows[rowNum] = row;
    }

    public void deleteRow(int rowNum) {
        for (int i = rowNum; i < end; i++) {
            rows[i] = rows[i + 1];
        }
        end--;
    }
}
