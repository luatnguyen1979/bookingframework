package usa.edu.mum.asd.lectures.lec7.flyweight;

import java.awt.*;

public class ConcreteHeavyweight implements Flyweight {

    private Color color = null; //intrinsic state
    private String string = ""; //extrinsic state
    private int x, y; //extrinsic state

    public ConcreteHeavyweight(String string, Color color, int x, int y) {
        this.string = string;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g, String str, Color color, int i, int j) {
        g.setColor(color);
        g.drawString(string, x, y);
    }
}