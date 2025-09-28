package geometrical_shapes;

import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Line implements Drawable, Displayable {
    private Point p1, p2;
    private Color color;

    public Line(Point p1, Point p2) { 
        this.p1 = p1; 
        this.p2 = p2; 
        this.color = Color.WHITE;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }

    public static Line random(int maxWidth, int maxHeight) {
        return new Line(Point.random(maxWidth, maxHeight), Point.random(maxWidth, maxHeight));
    }

    @Override
    public void draw(Displayable displayable) {
        if (displayable instanceof Image) {
            Image image = (Image) displayable;
            Graphics g = image.getGraphics2D();
            g.setColor(this.color);
            g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        }
    }

    @Override public Color getColor() { return color; }
    
    @Override
    public void display(int x, int y, Color color) {
        System.out.println("Line: (" + p1.getX() + ", " + p1.getY() + ") to (" + p2.getX() + ", " + p2.getY() + ")");
    }
    
    @Override
    public void save(String filename) {
        System.out.println("Saving line data.");
    }
}
