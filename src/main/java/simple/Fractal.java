package simple;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

// See https://gist.github.com/j-mcc1993/ef75a9227eeac139ee94
public class Fractal {
    public static void main(String[] args) {
        int width = 2048/2;
        int height = 1536/2;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, (x-y)*(x+y)&(x|y));
            }
        }
        File img = new File("c:/tmp/fractal-1.png");
        try {
            ImageIO.write(image, "png", img);
        } catch (IOException e) {}
    }
}
