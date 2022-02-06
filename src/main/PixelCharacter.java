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
import java.util.Random;

public class PixelCharacter {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    static final int FRAME_WIDTH = 15;
    static final int FRAME_HEIGHT = 16;

    public static BufferedImage generateImage(String text) {
        byte[] hash = text.getBytes();
        BufferedImage imageLight = new BufferedImage(FRAME_WIDTH, FRAME_HEIGHT, BufferedImage.TYPE_INT_ARGB);
        WritableRaster raster = imageLight.getRaster();

        // skin layer 1
        int skinColor = new Random().nextInt(5);
        for (int x = 3; x < FRAME_WIDTH - 3; x++)
            for (int y = 3; y < FRAME_HEIGHT - 3; y++)
                raster.setPixel(x, y, SkinColors.pickSkinColor(skinColor));

        // hair layer 4
        HairTypes.pickHair(raster, new Random().nextInt(7));

        // eyes layer 2
        EyeTypes.pickEye(raster, new Random().nextInt(11));

        // nose layer 3
        //for(int x = 0; x < FRAME_WIDTH; x++) for(int y = 0; y < FRAME_HEIGHT; y++) if(y==8 && x == 7) raster.setPixel(x, y, NOSE);

        // lip layer 4
        LipTypes.pickLip(raster, new Random().nextInt(7));

        BufferedImage finalImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);

        //Scale image to the size you want
        AffineTransform transform = new AffineTransform();
        transform.scale(WIDTH / FRAME_WIDTH, HEIGHT / FRAME_HEIGHT);
        AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);

        finalImage = op.filter(imageLight, finalImage);
        return finalImage;
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        String[] bit = {"dfhgdh", "jfghjfghj", "yrjrtjryh", "hgjfghj", "dgsdfg", "dfgdfgdfg", "fgdfgdg", "sdgdfgdfhdhd", "dfgfdgdfghthrd", "rdsgdfgfjkhj", "sdkgfkujdbgkl", "dfkjghjkf", "dkjfghkjdfhg", "dkjfghkjfblkdf"};
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

    public static void saveImages(BufferedImage bufferedImage, String name) throws IOException {
        ImageIO.write(bufferedImage, "png", new File(name + "_light" + ".png"));
    }
}
