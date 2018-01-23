package usa.edu.mum.asd.labs.lab6.composite;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Component {

    protected Collection<Component> list = new ArrayList<Component>();

    protected String tag;

    public Component(String tag) {
        this.tag = tag;
    }

    public abstract void print();

    public void addItem(Component item) {
        list.add(item);
    }
}