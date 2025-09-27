// package geometrical_shapes;

// import java.awt.Graphics;
// import java.util.Random;

// public class Circle implements Drawable, Displayable {
//     private int x, y, radius;
//     private String color;

//     public Circle(int x, int y, int radius) {
//         this.x = x;
//         this.y = y;
//         this.radius = radius;
//         this.color = "white";
//     }

//     // Random circle
//     public static Circle random(int maxWidth, int maxHeight) {
//         Random r = new Random();
//         int x = r.nextInt(maxWidth);
//         int y = r.nextInt(maxHeight);
//         int radius = 5 + r.nextInt(50); // radius between 5 and 55 pixels
//         return new Circle(x, y, radius);
//     }

//     public int getX() { return x; }
//     public int getY() { return y; }
//     public int getRadius() { return radius; }

//     @Override
//     public void draw(Image image) {
//         Graphics g = image.getGraphics2D();
//         g.setColor(java.awt.Color.WHITE);
//         g.fillOval(x - radius, y - radius, radius * 2, radius * 2); // circle centered at (x,y)
//     }

//     @Override
//     public String getColor() { return color; }

//     @Override
//     public void display() {
//         System.out.println("Circle: center=(" + x + "," + y + "), radius=" + radius + " color=" + color);
//     }

//     @Override
//     public void save(String filename) {
//         System.out.println("Saving circle to " + filename);
//     }
// }
