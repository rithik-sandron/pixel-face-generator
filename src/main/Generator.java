package main;

import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Generator {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final int FRAME_WIDTH = 5;
    private static final int FRAME_HEIGHT = 5;
    private static int[] BACKGROUND_DARK = new int[]{0, 0, 0, 255};
    private static int[] BACKGROUND_LIGHT = new int[]{255, 255, 255, 255};

    public static BufferedImage[] generateImage(String text) {
        byte[] hash = text.getBytes();
        BufferedImage imageLight = new BufferedImage(FRAME_WIDTH, FRAME_HEIGHT, BufferedImage.TYPE_INT_ARGB);
        BufferedImage imageDark = new BufferedImage(FRAME_WIDTH, FRAME_HEIGHT, BufferedImage.TYPE_INT_ARGB);
        WritableRaster lightRaster = imageLight.getRaster();
        WritableRaster darkRaster = imageDark.getRaster();
        final int[] PIXEL = {hash[0] * 150, hash[1] * 150, hash[2] * 150, 230};

        for (int x = 0; x < FRAME_WIDTH; x++) {
            for (int y = 0; y < FRAME_HEIGHT; y++) {
                if ((hash[y] >> x & 1) == 1 || (hash[x] >> y & 1) == 2) {
                    int[] pixelColor = PIXEL;
                    lightRaster.setPixel(x, y, pixelColor);
                    darkRaster.setPixel(x, y, pixelColor);
                } else {
                    lightRaster.setPixel(x, y, BACKGROUND_LIGHT);
                    darkRaster.setPixel(x, y, BACKGROUND_DARK);
                }
            }
        }

        BufferedImage finalImageLight = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
        BufferedImage finalImageDark = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);

        //Scale image to the size you want
        AffineTransform transform = new AffineTransform();
        transform.scale(WIDTH / FRAME_WIDTH, HEIGHT / FRAME_HEIGHT);
        AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);

        finalImageLight = op.filter(imageLight, finalImageLight);
        finalImageDark = op.filter(imageDark, finalImageDark);
        return new BufferedImage[]{finalImageLight, finalImageDark};
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        String[] bit = {"fgndfnsfgns", "bmnkj,ugildj", "ascdcraeyhtrgz", "asgvSDFgvewjh fd ew", "sdgwGRE EW wefqFCF SD"};
        for (String s : bit) saveImages(generateImage(sha512(s)), s);
    }

    public static String sha512(String message) throws NoSuchAlgorithmException {
        return hex(MessageDigest.getInstance("SHA-512").digest(message.getBytes()));
    }

    public static String hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) sb.append(Integer.toHexString(~b & 0xff));
        return sb.toString();
    }

    public static void saveImages(BufferedImage[] bufferedImages, String name) throws IOException {
        ImageIO.write(bufferedImages[0], "png", new File(name + "_light" + ".png"));
        ImageIO.write(bufferedImages[1], "png", new File(name + "_dark" + ".png"));
    }
}
