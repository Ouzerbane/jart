package geometrical_shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Image {
    private int width;
    private int height;
    private BufferedImage buffer;
    private Graphics2D g2d;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        this.buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        this.g2d = buffer.createGraphics();

        // Fill background with black
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, width, height);
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public Graphics2D getGraphics() { return g2d; }

    public void save(String filename) {
        try {
            ImageIO.write(buffer, "png", new File(filename));
            System.out.println("Image saved to " + filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
