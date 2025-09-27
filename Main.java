import  geometrical_shapes.* ;
import java.awt.Color;


interface Displayable {
    void display(int x, int y, Color color);
    void save(String string);
}

interface Drawable {
    void draw(Displayable displayable);
    Color getColor();
}

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);
        Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900), new Point(100, 900));
        triangle.draw(image);

        // for (int i = 0; i < 50; i++) {
        //     Circle circle = Circle.random(image.getWidth(), image.getHeight());
        //     circle.draw(image);
        // }
        image.save("image.png");
    }
}

















// public class Main {
//     public static void main(String[] args) {
//         Image image = new Image(1000, 1000);

//         for (int i = 0; i < 50; i++) {
//             Point p = Point.random(image.getWidth(), image.getHeight());
//             p.draw(image.getGraphics());
//         }
//      Line line1 = new Line(new Point(50,50), new Point(300,200));
//         line1.draw(image.getGraphics());

// // line random
//         Line line2 = Line.random(image.getWidth(), image.getHeight());
//         line2.draw(image.getGraphics());

//     Triangle t1 = new Triangle(
//     new Point(100,100),
//     new Point(900,900),
//     new Point(100,900)
// );
// t1.draw(image.getGraphics());

// // Triangle random
// Triangle t2 = Triangle.random(image.getWidth(), image.getHeight());
// t2.draw(image.getGraphics());

//         image.save("image.png");
//         System.out.println("Done!");
//     }
// }
