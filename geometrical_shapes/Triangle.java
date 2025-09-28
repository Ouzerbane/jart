package geometrical_shapes;
import java.awt.Color;

public class Triangle implements Drawable {
    private Point p0, p1, p2;
    private Color color;

    public Triangle(Point p0, Point p1, Point p2) {
        this.p0 = p0;
        this.p1 = p1;
        this.p2 = p2;
        this.color = Color.WHITE;
    }

    @Override
    public void draw(Displayable disp){
        drawLine(p0,p1,disp, getColor());
        drawLine(p1,p2,disp, getColor());
        drawLine(p2,p0,disp, getColor());
    }

    @Override public  Color getColor() { return color; }
}
