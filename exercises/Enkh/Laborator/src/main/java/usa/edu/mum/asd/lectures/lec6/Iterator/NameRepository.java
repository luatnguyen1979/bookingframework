package usa.edu.mum.asd.lectures.lec6.Iterator;

public class NameRepository implements Aggregate {

    private String names[] = {"Rob", "Jon", "Jul", "Lor", "Pat",
            "Ken"};

    //other methods of the NameRepository...
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}