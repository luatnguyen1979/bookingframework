package usa.edu.mum.asd.labs.lab6.composite;

public class Leaf extends Component {

    private String content;

    public Leaf(String tag, String content) {
        super(tag);
        this.content = content;
    }

    public void print() {
        System.out.println("Leaf [tag=" + tag + ", content=" +
                content + "]");
    }
}