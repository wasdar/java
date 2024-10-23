package lab6.shapes;

import java.awt.*;

public class Rectangle extends Shape {
    int width, height;

    public Rectangle(Color color, int x, int y, int width, int height){
        super(color, x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
