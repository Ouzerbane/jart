package geometrical_shapes;

import java.awt.Graphics;

public class Point implements Drawable, Displayable {
    private int x, y;
    private String color;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = "black";
    }

    
    @Override
    public void draw(Graphics g) {
        g.drawOval(x, y, 2, 2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display() {
        System.out.println("Point(" + x + "," + y + ") color=" + color);
    }

    @Override
    public void save(String filename) {
        System.out.println("Saving point to " + filename);
    }
}