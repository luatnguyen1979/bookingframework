package usa.edu.mum.asd.lectures.lec10.decorator;

public class Client {

    public static void main(String[] args) {
        //decorate the Window with both vertical and horizontal scroll bars
        GUIContainer decoratedWindow = new HorizontalScrollBarDecorator(
                new VerticalScrollBarDecorator(new Window()));
        System.out.println(decoratedWindow.getDescription());
    }
}