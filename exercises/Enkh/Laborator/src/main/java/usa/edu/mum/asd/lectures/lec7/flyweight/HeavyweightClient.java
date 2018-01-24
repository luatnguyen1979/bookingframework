package usa.edu.mum.asd.lectures.lec7.flyweight;

import java.awt.*;

public class HeavyweightClient {

    public static void main(String[] args) {
        Panel panel = new Panel();
        Graphics g = panel.getGraphics();
        for (int i = 0; i < 10000; ++i) {
            Color color = Color.BLACK;
            ConcreteHeavyweight sh = new ConcreteHeavyweight(new String("Hello"), color, 10, 20);
            sh.draw(g, "", color, 0, 0);
        }
    }
}
