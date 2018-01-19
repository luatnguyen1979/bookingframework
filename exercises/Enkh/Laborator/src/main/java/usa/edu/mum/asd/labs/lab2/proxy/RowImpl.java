package usa.edu.mum.asd.labs.lab2.proxy;

public class RowImpl implements IRow {
    private String element;

    public RowImpl(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }
}
