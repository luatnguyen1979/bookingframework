package usa.edu.mum.asd.lectures.lec7.flyweight;

import java.awt.*;

public class ConcreteFlyweight implements Flyweight {

    Color color; //only the intrinsic state

    public ConcreteFlyweight(Color color) {
        this.color = color;
    }

    public void draw(Graphics g, String string, int x, int y) {
        g.setColor(this.color);
        g.drawString(string, x, y);
    }

    @Override
    public void draw(Graphics g, String string, Color color, int x, int y) {
        g.setColor(color);
        g.drawString(string, x, y);
    }
}