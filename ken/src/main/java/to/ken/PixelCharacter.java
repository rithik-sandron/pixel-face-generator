package to.ken;

import to.ken.types.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class PixelCharacter {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        int i = 1;
        // create 1200 images of size 850 X 850
        while(i< 1201) {
            String name = "image_" + i++;
            List<Character> l = new ArrayList<>();
            l.add('M');
            l.add('F');
            Collections.shuffle(l);
            String sha512 = sha512(name);
            saveImages(generateImage(sha512, l.get(0)), name);
        }
    }

    public static void saveImages(BufferedImage bufferedImage, String name) throws IOException {
        ImageIO.write(bufferedImage, "png", new File(name + ".png"));
    }

    public static BufferedImage generateImage(String text, char gender) {
        byte[] hash = text.getBytes();

        StringBuilder bi = new StringBuilder();
        for(byte b : hash) bi.append(b);

        Random random = new Random();
        long seed = Long.valueOf(bi.toString().substring(9, 26)) + gender;
        random.setSeed(seed);
        Image.random = random;

        BufferedImage image = Image.createBufferedImage();
        WritableRaster raster = image.getRaster();
        // background 1
        BackgroundType.pickBackground(raster);
        // skin layer 2
        SkinTypes.pickSkin(raster);
        // hair layer 3
        if('M' == gender) MaleAndUniSexHairs.pickHair(raster, random.nextInt(12));
        else if('F' == gender) FemaleAndUnisexHairs.pickHair(raster, random.nextInt(14));
        // eyes layer 4
        EyeTypes.pickEye(raster, random.nextInt(30));
        // lip layer 5
        LipTypes.pickLip(raster, random.nextInt(11));

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
