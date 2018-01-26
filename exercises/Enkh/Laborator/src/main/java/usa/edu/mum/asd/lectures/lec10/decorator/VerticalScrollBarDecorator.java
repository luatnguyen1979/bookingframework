package usa.edu.mum.asd.lectures.lec10.decorator;

public class VerticalScrollBarDecorator extends WindowDecorator {

    public VerticalScrollBarDecorator(GUIContainer windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    @Override
    public void paint() {
        super.paint();
        paintVerticalScrollBar();
    }

    private void paintVerticalScrollBar() {
        // implementation
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", adding vertical scrollbar";
    }
}