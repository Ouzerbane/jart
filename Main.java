import geometrical_shapes.*;
import java.awt.Color;
import java.util.Random;

public class Main {

    private static Color getRandomColor() {
        Random r = new Random();
        int red = 50 + r.nextInt(206);
        int green = 50 + r.nextInt(206);
        int blue = 50 + r.nextInt(206);
        return new Color(red, green, blue);
    }

    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        
        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);
        
        Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900), new Point(100, 900));
        triangle.draw(image);
        Line singleLine = new Line(new Point(500, 100), new Point(800, 700));
        singleLine.draw(image);
        
        Point singlePoint = new Point(500, 500);
        singlePoint.draw(image);

        for (int i = 0; i < 100; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.setColor(getRandomColor());
            circle.draw(image);
        }
        
        image.save("image.png");
    }
}