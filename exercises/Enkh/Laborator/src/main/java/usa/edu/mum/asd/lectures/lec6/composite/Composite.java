package usa.edu.mum.asd.lectures.lec6.composite;

public class Composite extends Component {

    public Composite(String title) {
        super(title);
    }

    public void print() {
        System.out.println("Composite name=" + title);
        for (Component item : list) {
            item.print();
        }
    }
}