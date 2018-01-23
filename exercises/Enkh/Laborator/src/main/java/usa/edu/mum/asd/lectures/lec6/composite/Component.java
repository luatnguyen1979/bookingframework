package usa.edu.mum.asd.lectures.lec6.composite;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Component {

    protected Collection<Component> list = new ArrayList<Component>();

    protected String title;

    public Component(String title) {
        this.title = title;
    }

    public abstract void print();

    public void addItem(Component item) {
        list.add(item);
    }
}