package geometrical_shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image implements Displayable{
    private BufferedImage buffer;
    private Graphics2D g2d;

    public Image(int width, int height) {
        buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        g2d = buffer.createGraphics();
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, width, height);
    }

    public int getWidth() { return buffer.getWidth(); }
    public int getHeight() { return buffer.getHeight(); }

    @Override
    public void display(int x, int y, Color color) {
        // System.out.println("test displat func");
        if (x >= 0 && x < buffer.getWidth() && y >= 0 && y < buffer.getHeight()) {
            buffer.setRGB(x, y, color.getRGB());
        }
    }

    @Override
    public void save(String fname) {
        try {
            File file = new File(fname);
            ImageIO.write(buffer, "png", file);
            System.out.println("test -> " + fname);
        } catch (IOException e) {
            System.err.println("err in saving ->" + e.getMessage());
        }
    }

}
