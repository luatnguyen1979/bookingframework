package usa.edu.mum.asd.labs.lab12.lab12.visitor;

import java.util.LinkedList;
import java.util.List;

public abstract class Composite implements Component {

    private List<Composite> compositeList = new LinkedList<>();

    public void addComponent(Composite composite) {
        compositeList.add(composite);
    }

    public List<Composite> getCompositeList() {
        return compositeList;
    }
}
