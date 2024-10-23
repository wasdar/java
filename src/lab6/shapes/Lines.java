package lab6.shapes;

import java.awt.*;

public class Lines extends Shape{
    int x2, y2;

    public Lines(Color color, int x, int y, int x2, int y2){
        super(color, x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    void draw(Graphics2D g) {
        g.setColor(color);
        g.drawLine(x,y,x2,y2);
    }
}
