package usa.edu.mum.asd.labs.lab10.decorator;

public abstract class DecoratorList implements ComponentList {

    protected ComponentList componentList;

    public DecoratorList(ComponentList componentList) {
        this.componentList = componentList;
    }

    @Override
    public int size() {
        return componentList.size();
    }

    @Override
    public boolean contains(Object o) {
        return componentList.contains(o);
    }

    @Override
    public boolean add(Object o) {
        return componentList.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return componentList.add(0);
    }
}
