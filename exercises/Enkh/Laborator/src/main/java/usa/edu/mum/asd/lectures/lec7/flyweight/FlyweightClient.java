package usa.edu.mum.asd.lectures.lec7.flyweight;

import java.awt.*;

public class FlyweightClient {

    private static FlyweightFactory flyweightFactory = new FlyweightFactory();

    public static void main(String[] args) {
        Panel panel = new Panel();
        Graphics g = panel.getGraphics();
        for (int i = 0; i < 10000; ++i) {
            Color color = Color.BLACK;
            ConcreteFlyweight line = flyweightFactory.getInstance(color);
            line.draw(g, "Hello", 10, 20);
        }
    }
}
