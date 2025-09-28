package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Point implements Drawable, Displayable {
    private int x, y;
    private Color color;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.WHITE; 
    }

    public static Point random(int maxWidth, int maxHeight) {
        Random r = new Random();
        return new Point(r.nextInt(maxWidth), r.nextInt(maxHeight));
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public void setColor(Color color) { this.color = color; } 

    @Override
    public void draw(Displayable displayable) {
        if (displayable instanceof Image) {
            Image img = (Image) displayable;
            img.getGraphics2D().setColor(color);
            img.getGraphics2D().fillOval(x, y, 3, 3);
        }
    }

    @Override
    public Color getColor() { return color; }
    
    @Override
    public void display(int x, int y, Color color) { 
        System.out.println("Point(" + this.x + "," + this.y + ") color=" + color); 
    }
    
    @Override
    public void save(String filename) { 
        System.out.println("Saving point to " + filename); 
    }
}
