package usa.edu.mum.asd.lectures.lec10.decorator;

/**
 * ConcreteDecorator.
 * adds responsibilities to the component.
 */
public class HorizontalScrollBarDecorator extends WindowDecorator {

    public HorizontalScrollBarDecorator(GUIContainer windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    @Override
    public void paint() {
        super.paint();
        paintHorizontalScrollBar();
    }

    private void paintHorizontalScrollBar() {
        // implementation
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", adding horizontal scrollbar ";
    }
}