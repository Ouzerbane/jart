package geometrical_shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Graphics;

public class Image implements Displayable {
    private int width, height;
    private BufferedImage buffer;
    private Graphics2D g2d;
    
    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        g2d = buffer.createGraphics();
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, width, height);
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    public Graphics getGraphics2D() { return g2d; }

    @Override
    public void display(int x, int y, Color color) {
        g2d.setColor(color);
        g2d.fillOval(x, y, 3, 3);
    }

    @Override
    public void save(String filename) {
        try { 
            ImageIO.write(buffer, "png", new File(filename)); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
    }
}
