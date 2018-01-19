package usa.edu.mum.asd.labs.lab2.proxy;

public class Proxy implements ITable {

    private Integer[] locks;
    private ITable iTable;

    public Proxy() {
        this.iTable = new TableImpl();
        this.locks = new Integer[iTable.numOfRows()];
        for (int i = 0; i < iTable.numOfRows(); i++) {
            locks[i] = new Integer(i);
        }
    }

    public int numOfRows() {
        return iTable.numOfRows();
    }

    public IRow getRow(int rowNum) {
        return iTable.getRow(rowNum);
    }

    public void addRow(IRow row, int rowNum) {
        synchronized (locks[rowNum]) {
            iTable.addRow(row, rowNum);
        }
    }

    public void modifyRow(int rowNum, IRow row) {
        synchronized (locks[rowNum]) {
            iTable.modifyRow(rowNum, row);
        }
    }

    public void deleteRow(int rowNum) {
        synchronized (locks[rowNum]) {
            iTable.deleteRow(rowNum);
        }
    }
}
