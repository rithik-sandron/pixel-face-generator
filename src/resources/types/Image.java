package resources.types;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.util.Random;

public final class Image {
    public static Random random = null;
    public final static int[] getRandomColor() {
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new int[]{r, g, b, 240};
    }

    public final static int[] getRandomBGColor() {
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
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
