package usa.edu.mum.asd.labs.lab6.iterator;

public class NameRepository implements Aggregate {

    private String names[][];
    private int idx;
    private int jdx;
    private int size;
    private int len;

    public NameRepository() {
        this.len = 3;
        this.names = new String[len][len];
        this.idx = 0;
        this.jdx = 0;
        this.size = 0;
    }

    public boolean addName(String name) {
        if (size == len * len) reSize();
        while (true) {
            if (jdx == len) {
                jdx = 0;
                idx++;
            }
            if (idx == len) {
                jdx = 0;
                idx = 0;
            }
            if (names[idx][jdx] != null && names[idx][jdx].equals("-")) {
                jdx++;
                continue;
            }
            names[idx][jdx++] = name;
            break;
        }
        size++;
        return true;
    }

    public boolean removeName(int i, int j) {
        if (i >= len || j >= len) return false;
        if (names[i][j] == null || names[i][j].equals("-")) return false;
        names[i][j] = "-";
        size--;
        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void reSize() {
        String[][] ret = new String[len * 2][len * 2];
        int i, j;
        idx = 0;
        jdx = 0;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                if (jdx == len * 2) {
                    jdx = 0;
                    idx++;
                }
                ret[idx][jdx] = names[i][j++];
            }
        }
        len = len * 2;
        names = ret;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int k = 0;
        int l = 0;

        @Override
        public boolean hasNext() {
            while (true) {
                if (l == len) {
                    l = 0;
                    k++;
                }
                if (k == len) return false;
                if (names[k][l] == null) return false;
                if (names[k][l].equals("-")) {
                    l++;
                }
                return true;
            }
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[k][l++];
            }
            return null;
        }
    }
}