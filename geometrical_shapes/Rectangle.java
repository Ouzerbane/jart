package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {
    private Point p0, p1;
    private Color color;

    public Rectangle(Point p1, Point p2) { this.p0 = p1; this.p1 = p2; this.color = Color.white; }

    public static Rectangle random(int maxWidth, int maxHeight) {
        return new Rectangle(Point.random(maxWidth, maxHeight), Point.random(maxWidth, maxHeight));
    }

    @Override
    // public void draw(Image image) {
    //     Graphics g = image.getGraphics2D();
    //     g.setColor(java.awt.Color.WHITE);
    //     int x = Math.min(p1.getX(), p2.getX());
    //     int y = Math.min(p1.getY(), p2.getY());
    //     int w = Math.abs(p1.getX() - p2.getX());
    //     int h = Math.abs(p1.getY() - p2.getY());
    //     g.drawRect(x, y, w, h);
    // }
    public void draw(Displayable disp) {
        int x0 = p0.x ; 
        int y0 = p0.y ; 
        int x1 = p1.x ; 
        int y1 = p1.y ; 
        Point top_right = new Point(x1,y0);
        Point bottom_left = new Point(x0,y1);
        
        drawLine(p0,top_right,disp, getColor());
        drawLine(top_right,p1,disp, getColor());
        drawLine(p1, bottom_left,disp, getColor());
        drawLine(bottom_left, p0,disp, getColor());
    }

    @Override public Color getColor() { return color; }

    // @Override public void display() {
    //     System.out.println("Rectangle: (" + p1.getX() + "," + p1.getY() + ") to (" + p2.getX() + "," + p2.getY() + ") color=" + color);
    // }

    // @Override public void save(String filename) { System.out.println("Saving rectangle to " + filename); }
}
