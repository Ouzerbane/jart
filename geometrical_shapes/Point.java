package geometrical_shapes;

import java.awt.Graphics;
import java.util.Random;

public class Point implements Drawable, Displayable {
    private int x, y;
    private String color;

    public Point(int x, int y) { this.x = x; this.y = y; this.color = "white"; }

    public static Point random(int maxWidth, int maxHeight) {
        Random r = new Random();
        return new Point(r.nextInt(maxWidth), r.nextInt(maxHeight));
    }

    public int getX() { return x; }
    public int getY() { return y; }

    @Override
    public void draw(Image image) {
        Graphics g = image.getGraphics2D();
        g.setColor(java.awt.Color.WHITE);
        g.fillOval(x, y, 3, 3);
    }

    @Override public String getColor() { return color; }
    @Override public void display() { System.out.println("Point(" + x + "," + y + ") color=" + color); }
    @Override public void save(String filename) { System.out.println("Saving point to " + filename); }
}
