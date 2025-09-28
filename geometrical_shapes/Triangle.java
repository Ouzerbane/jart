package geometrical_shapes;

import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Triangle implements Drawable, Displayable {
    private Point p1, p2, p3;
    private Color color;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1; this.p2 = p2; this.p3 = p3; this.color = Color.WHITE;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Triangle random(int maxWidth, int maxHeight) {
        return new Triangle(Point.random(maxWidth, maxHeight), 
                            Point.random(maxWidth, maxHeight), 
                            Point.random(maxWidth, maxHeight));
    }

    @Override
    public void draw(Displayable displayable) {
        if (displayable instanceof Image) {
            Image image = (Image) displayable;
            Graphics g = image.getGraphics2D();
            g.setColor(this.color);
            g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
            g.drawLine(p2.getX(), p2.getY(), p3.getX(), p3.getY());
            g.drawLine(p3.getX(), p3.getY(), p1.getX(), p1.getY());
        }
    }

    @Override public Color getColor() { return color; }

    @Override public void display(int x, int y, Color color) {
        System.out.println("Triangle: (" + p1.getX() + "," + p1.getY() + "), (" + 
                           p2.getX() + "," + p2.getY() + "), (" + 
                           p3.getX() + "," + p3.getY() + ")");
    }
    @Override public void save(String filename) { System.out.println("Saving triangle data."); }
}
