package geometrical_shapes;

import java.awt.Graphics;

public class Triangle implements Drawable, Displayable {
    private Point p1, p2, p3;
    private String color;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1; this.p2 = p2; this.p3 = p3; this.color = "white";
    }

    public static Triangle random(int maxWidth, int maxHeight) {
        return new Triangle(Point.random(maxWidth, maxHeight), 
                            Point.random(maxWidth, maxHeight), 
                            Point.random(maxWidth, maxHeight));
    }

    @Override
    public void draw(Image image) {
        Graphics g = image.getGraphics2D();
        g.setColor(java.awt.Color.WHITE);
        g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        g.drawLine(p2.getX(), p2.getY(), p3.getX(), p3.getY());
        g.drawLine(p1.getX(), p1.getY(), p3.getX(), p3.getY());
    }

    @Override public String getColor() { return color; }
    @Override public void display() {
        System.out.println("Triangle: (" + p1.getX() + "," + p1.getY() + "), (" + 
                           p2.getX() + "," + p2.getY() + "), (" + 
                           p3.getX() + "," + p3.getY() + ") color=" + color);
    }
    @Override public void save(String filename) { System.out.println("Saving triangle to " + filename); }
}
