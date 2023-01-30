package to.ken;

import to.ken.types.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class PixelCharacterRandom {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        int i = 1;
        // create 1200 images of size 850 X 850
        while(i < 1200) {
            String name = "image_" + i++;
            saveImages(generateImage(), name);
        }
    }

    public static void saveImages(BufferedImage bufferedImage, String name) throws IOException {
        ImageIO.write(bufferedImage, "png", new File(name + ".png"));
    }

    public static BufferedImage generateImage() {
        Random random = new Random();
        BufferedImage image = Image.createBufferedImage();
        WritableRaster raster = image.getRaster();
        // background 1
        BackgroundType.pickBackground(raster);
        // skin layer 2
        SkinTypes.pickSkin(raster);
        // hair layer 3
        HairTypesRandom.pickHair(raster, random.nextInt(21));
        // eyes layer 4
        EyeTypes.pickEye(raster, random.nextInt(30));
        // lip layer 5
        LipTypes.pickLip(raster, random.nextInt(11));

        BufferedImage finalImage = Image.createFinalBufferedImage();
        //Scale image to the size you want
        Image.doScalingAndFilter(image, finalImage);
        return finalImage;
    }
}
