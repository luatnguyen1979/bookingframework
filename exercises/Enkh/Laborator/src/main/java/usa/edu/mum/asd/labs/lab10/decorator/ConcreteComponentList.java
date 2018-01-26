package usa.edu.mum.asd.labs.lab10.decorator;

import java.util.List;

public class ConcreteComponentList implements ComponentList {

    private List list;

    public ConcreteComponentList(List list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public boolean add(Object o) {
        return list.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }
}
