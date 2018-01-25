package usa.edu.mum.asd.labs.lab8.memento;

public class CareTaker {

    private int size = 100;
    private Memento[] mementoList = new Memento[size];
    private int index = 0;

    public void add(Memento state) {
        mementoList[index++] = state;
    }

    public Memento get(int idx) {
        Memento memento = mementoList[idx];
        for (int i = idx; i < size - 1; i++) {
            mementoList[i] = mementoList[i + 1];
        }
        index--;
        return memento;
    }

    public int getIndex() {
        return index;
    }
}