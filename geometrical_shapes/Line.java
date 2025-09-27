package geometrical_shapes;

import java.awt.Graphics;

public class Line implements Drawable, Displayable {
    private Point p1, p2;
    private String color;

    public Line(Point p1, Point p2) { this.p1 = p1; this.p2 = p2; this.color = "white"; }

    public static Line random(int maxWidth, int maxHeight) {
        return new Line(Point.random(maxWidth, maxHeight), Point.random(maxWidth, maxHeight));
    }

    @Override
    public void draw(Image image) {
        Graphics g = image.getGraphics2D();
        g.setColor(java.awt.Color.WHITE);
        g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    @Override public String getColor() { return color; }
    @Override public void display() {
        System.out.println("Line: (" + p1.getX() + "," + p1.getY() + ") to (" + p2.getX() + "," + p2.getY() + ") color=" + color);
    }
    @Override public void save(String filename) { System.out.println("Saving line to " + filename); }
}
