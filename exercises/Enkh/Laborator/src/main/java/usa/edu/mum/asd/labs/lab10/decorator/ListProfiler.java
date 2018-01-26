package usa.edu.mum.asd.labs.lab10.decorator;

public class ListProfiler extends DecoratorList {

    private Long start;
    private Long end;

    public ListProfiler(ComponentList componentList) {
        super(componentList);
    }

    @Override
    public int size() {
        start = System.currentTimeMillis();
        int ret = super.size();
        end = System.currentTimeMillis();
        System.out.println("Size operation. Diff=" + (end - start));
        return ret;
    }

    @Override
    public boolean contains(Object o) {
        start = System.currentTimeMillis();
        boolean ret = super.contains(o);
        end = System.currentTimeMillis();
        System.out.println("Contains operation. Diff=" + (end - start));
        return ret;

    }

    @Override
    public boolean add(Object o) {
        start = System.currentTimeMillis();
        boolean ret = super.add(o);
        end = System.currentTimeMillis();
        System.out.println("Add operation. Diff=" + (end - start));
        return ret;

    }

    @Override
    public boolean remove(Object o) {
        start = System.currentTimeMillis();
        boolean ret = super.remove(o);
        end = System.currentTimeMillis();
        System.out.println("Remove operation. Diff=" + (end - start));
        return ret;

    }
}
