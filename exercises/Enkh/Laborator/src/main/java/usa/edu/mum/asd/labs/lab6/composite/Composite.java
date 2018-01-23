package usa.edu.mum.asd.labs.lab6.composite;

public class Composite extends Component {

    public Composite(String title) {
        super(title);
    }

    public void print() {
        System.out.println("Composite name=" + tag);
        for (Component item : list) {
            item.print();
        }
    }
}