package main;

import resources.types.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class PixelCharacter {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        int i = 0;
        while(i++ < 100)
            saveImages(generateImage(sha512("sample")), "sample_"+i);
    }

    public static void saveImages(BufferedImage bufferedImage, String name) throws IOException {
        ImageIO.write(bufferedImage, "png", new File(name + "" + ".png"));
    }

    public static BufferedImage generateImage(String text) {
//        byte[] hash = text.getBytes();
        BufferedImage image = Image.createBufferedImage();
        WritableRaster raster = image.getRaster();

        // background
        BackgroundType.pickBackground(raster);
        // skin layer 1
        SkinTypes.pickSkin(raster);
        // hair layer 4
        HairTypes.pickHair(raster, new Random().nextInt(21));
        // eyes layer 2
        EyeTypes.pickEye(raster, new Random().nextInt(12));
        // nose layer 3
        //for(int x = 0; x < FRAME_WIDTH; x++) for(int y = 0; y < FRAME_HEIGHT; y++) if(y==8 && x == 7) raster.setPixel(x, y, NOSE);
        // lip layer 4
        LipTypes.pickLip(raster, new Random().nextInt(11));

        BufferedImage finalImage = Image.createFinalBufferedImage();
        //Scale image to the size you want
        Image.doScalingAndFilter(image, finalImage);
        return finalImage;
    }

    public static String sha512(String message) throws NoSuchAlgorithmException {
        return hex(MessageDigest.getInstance("SHA-512").digest(message.getBytes()));
    }

    public static String hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) sb.append(Integer.toHexString(~b & 0xff));
        return sb.toString();
    }

}
