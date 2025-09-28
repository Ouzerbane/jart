package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {
    private Point p0, p1;
    private Color color;

    public Line(Point p0, Point p1) {
        this.p0 = p0;
        this.p1 = p1;
        this.color = getRandomColor(); 
    }

    public static Line random(int maxWidth, int maxHeight) {
        return new Line(Point.random(maxWidth, maxHeight), Point.random(maxWidth, maxHeight));
    }

    @Override
    public void draw(Displayable disp) {
        drawLine(p0,p1, disp, getColor());
    }

    @Override public Color getColor() { return color; }

}
