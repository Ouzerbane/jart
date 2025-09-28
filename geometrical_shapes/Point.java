package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Point implements Drawable {
    public int x, y;
    public Color color;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.white; 
    }

    public static Point random(int maxWidth, int maxHeight) {
        Random r = new Random();
        return new Point(r.nextInt(maxWidth), r.nextInt(maxHeight));
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public void setColor(Color color) { this.color = color; } 
    
    @Override
    public void draw(Displayable disp) {
        System.out.println("test draw func");
        disp.display(x, y, getColor());
    }

    @Override
    public Color getColor() { return color; }
}
