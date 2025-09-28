package geometrical_shapes;

import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Line implements Drawable {
    private Point p0, p1;
    private Color color;

    public Line(Point p0, Point p1) { this.p0 = p0; this.p1 = p1; this.color = Color.white; }

    public static Line random(int maxWidth, int maxHeight) {
        return new Line(Point.random(maxWidth, maxHeight), Point.random(maxWidth, maxHeight));
    }

    @Override
    // public void draw(Image image) {
    //     Graphics g = image.getGraphics2D();
    //     g.setColor(java.awt.Color.WHITE);
    //     g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    // }
    public void draw(Displayable disp) {
        drawLine(p0,p1, disp, getColor());
    }

    @Override public Color getColor() { return color; }

}
