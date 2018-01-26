package usa.edu.mum.asd.lectures.lec10.decorator;

/**
 * ConcreteComponent.
 * defines an object to which additional responsibilities can be attached.
 */
public class Window implements GUIContainer {
    @Override
    public void paint() {
        // implementation
    }

    @Override
    public String getDescription() {
        return "A Window Container";
    }
}