package lab6.shapes;

import java.awt.*;

public class Circle extends Shape{
    int radius;

    public Circle(Color color, int x, int y, int radius){
        super(color, x, y);
        this.radius=radius;
    }

    @Override
    void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}
