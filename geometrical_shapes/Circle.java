package geometrical_shapes;

import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable, Displayable {
    private Point center;
    private int radius;
    private Color color;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        this.color = Color.WHITE;
    }

    public static Circle random(int maxWidth, int maxHeight) {
        Random r = new Random();
        Point randomCenter = Point.random(maxWidth, maxHeight);
        int randomRadius = 5 + r.nextInt(100); 
        return new Circle(randomCenter, randomRadius);
    }

    public Point getCenter() { return center; }
    public int getRadius() { return radius; }
    public void setColor(Color color) { this.color = color; } 

    @Override
    public void draw(Displayable displayable) {
        if (displayable instanceof Image) {
            Image image = (Image) displayable;
            // Graphics g = image.getGraphics2D();
            // g.setColor(color);
            
            int x = center.getX();
            int y = center.getY();
            
            // g.drawOval(x - radius, y - radius, radius * 2, radius * 2);
        }
    }

    @Override public Color getColor() { return color; }

    @Override
    public void display(int x, int y, Color color) {
        System.out.println("Circle: Center=(" + center.getX() + ", " + center.getY() + "), Radius=" + radius);
    }
    
    @Override
    public void save(String filename) {
        System.out.println("Saving Circle data.");
    }
}
