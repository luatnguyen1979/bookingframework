package usa.edu.mum.asd.lectures.lec10.decorator;

/**
 * Decorator.
 * maintains a reference to a Component object and defines an interface that conforms to Component's interface.
 */
public abstract class WindowDecorator implements GUIContainer {

    protected GUIContainer windowToBeDecorated;

    public WindowDecorator(GUIContainer windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    @Override
    public void paint() {
        windowToBeDecorated.paint();
    }

    @Override
    public String getDescription() {
        return windowToBeDecorated.getDescription();
    }
}