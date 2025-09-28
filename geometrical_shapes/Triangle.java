package geometrical_shapes;

import java.awt.Color;

public class Triangle implements Drawable {
    private Point p0, p1, p2;
    private Color color;

    public Triangle(Point p0, Point p1, Point p2) {
        this.p0 = p0; this.p1 = p1; this.p2 = p2; this.color = Color.white;
    }

    public static Triangle random(int maxWidth, int maxHeight) {
        return new Triangle(Point.random(maxWidth, maxHeight), 
                            Point.random(maxWidth, maxHeight), 
                            Point.random(maxWidth, maxHeight));
    }

    @Override
    // public void draw(Image image) {
    //     Graphics g = image.getGraphics2D();
    //     g.setColor(java.awt.Color.WHITE);
    //     g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    //     g.drawLine(p2.getX(), p2.getY(), p3.getX(), p3.getY());
    //     g.drawLine(p1.getX(), p1.getY(), p3.getX(), p3.getY());
    // }
    public void draw(Displayable disp){
        drawLine(p0,p1,disp, getColor());
        drawLine(p1,p2,disp, getColor());
        drawLine(p2,p0,disp, getColor());
    }

    @Override public  Color getColor() { return color; }
}
