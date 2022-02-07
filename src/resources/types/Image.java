package resources.types;

import resources.types.Config;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Image {

    public final static int[] getRandomColor() {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return new int[]{r, g, b, 240};
    }

    public final static int[] getRandomBGColor() {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return new int[]{r, g, b, 120};
    }

    public final static BufferedImage createBufferedImage() {
        return new BufferedImage(Config.FRAME_WIDTH, Config.FRAME_HEIGHT, BufferedImage.TYPE_INT_ARGB);
    }

    public final static BufferedImage createFinalBufferedImage() {
        return new BufferedImage(Config.WIDTH, Config.HEIGHT, BufferedImage.TYPE_INT_ARGB);
    }

    public final static void doScalingAndFilter(BufferedImage image, BufferedImage finalImage) {
        AffineTransform transform = new AffineTransform();
        transform.scale(Config.WIDTH / Config.FRAME_WIDTH, Config.HEIGHT / Config.FRAME_HEIGHT);
        AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        finalImage = op.filter(image, finalImage);
    }
}
