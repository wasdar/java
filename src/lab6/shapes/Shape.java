package lab6.shapes;

import java.awt.*;

abstract class Shape {
    Color color;
    int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    abstract void draw(Graphics2D g);
}
