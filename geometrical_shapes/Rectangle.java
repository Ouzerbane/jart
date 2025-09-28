package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {
    private Point p0, p1;
    private Color color;

    public Rectangle(Point p1, Point p2) {
        this.p0 = p1;
        this.p1 = p2;
        this.color = getRandomColor();
    }

    @Override
    public void draw(Displayable disp) {
        int x0 = p0.getX();
        int y0 = p0.getY();
        int x1 = p1.getX();
        int y1 = p1.getY();
        Point top_right = new Point(x1, y0);
        Point bottom_left = new Point(x0, y1);

        drawLine(p0, top_right, disp, getColor());
        drawLine(top_right, p1, disp, getColor());
        drawLine(p1, bottom_left, disp, getColor());
        drawLine(bottom_left, p0, disp, getColor());
    }

    @Override
    public Color getColor() {
        return color;
    }
}
