package geometrical_shapes;

import java.awt.Graphics;

public class Rectangle implements Drawable, Displayable {
    private Point p1, p2;
    private String color;

    public Rectangle(Point p1, Point p2) { this.p1 = p1; this.p2 = p2; this.color = "white"; }

    public static Rectangle random(int maxWidth, int maxHeight) {
        return new Rectangle(Point.random(maxWidth, maxHeight), Point.random(maxWidth, maxHeight));
    }

    @Override
    public void draw(Image image) {
        Graphics g = image.getGraphics2D();
        g.setColor(java.awt.Color.WHITE);
        int x = Math.min(p1.getX(), p2.getX());
        int y = Math.min(p1.getY(), p2.getY());
        int w = Math.abs(p1.getX() - p2.getX());
        int h = Math.abs(p1.getY() - p2.getY());
        g.drawRect(x, y, w, h);
    }

    @Override public String getColor() { return color; }
    @Override public void display() {
        System.out.println("Rectangle: (" + p1.getX() + "," + p1.getY() + ") to (" + p2.getX() + "," + p2.getY() + ") color=" + color);
    }
    @Override public void save(String filename) { System.out.println("Saving rectangle to " + filename); }
}
