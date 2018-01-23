package usa.edu.mum.asd.lectures.lec7.flyweight;

import java.awt.*;

public interface Flyweight {

    public void draw(Graphics g, String string, Color color, int x, int y);
}