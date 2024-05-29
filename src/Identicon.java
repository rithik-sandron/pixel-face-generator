
import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Identicon {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final int FRAME_WIDTH = 5;
    private static final int FRAME_HEIGHT = 5;

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        Console con = System.console();
        String name = con.readLine("Provide a name!");
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Please provide a name! (String)");
        }
        saveImage(generateImage(sha512(args[0])), args[0]);
    }

    public static BufferedImage[] generateImage(String text) {
        byte[] hash = text.getBytes();
        BufferedImage imageLight = new BufferedImage(FRAME_WIDTH, FRAME_HEIGHT, BufferedImage.TYPE_INT_ARGB);
        BufferedImage imageDark = new BufferedImage(FRAME_WIDTH, FRAME_HEIGHT, BufferedImage.TYPE_INT_ARGB);
        WritableRaster raster = imageLight.getRaster();
        final int[] PIXEL = { hash[0] * 150, hash[1] * 150, hash[2] * 150, 255 };

        for (int x = 0; x < FRAME_WIDTH; x++) {
            for (int y = 0; y < FRAME_HEIGHT; y++) {
                if ((hash[y] >> x & 1) == 1 || (hash[x] >> y & 1) == 2) {
                    int[] pixelColor = PIXEL;
                    raster.setPixel(x, y, pixelColor);
                }
            }
        }

        BufferedImage finalImageLight = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
        BufferedImage finalImageDark = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);

        // Scale image to the size you want
        AffineTransform transform = new AffineTransform();
        transform.scale(WIDTH / FRAME_WIDTH, HEIGHT / FRAME_HEIGHT);
        AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);

        finalImageLight = op.filter(imageLight, finalImageLight);
        finalImageDark = op.filter(imageDark, finalImageDark);
        return new BufferedImage[] { finalImageLight, finalImageDark };
    }

    public static String sha512(String message) throws NoSuchAlgorithmException {
        return hex(MessageDigest.getInstance("SHA-512").digest(message.getBytes()));
    }

    public static String hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes)
            sb.append(Integer.toHexString(~b & 0xff));
        return sb.toString();
    }

    public static void saveImage(BufferedImage[] bufferedImages, String name) throws IOException {
        ImageIO.write(bufferedImages[0], "png", new File(name + ".png"));
    }
}
