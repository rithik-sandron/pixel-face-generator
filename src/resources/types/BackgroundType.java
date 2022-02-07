package resources.types;

import resources.types.Config;

import java.awt.image.WritableRaster;
import java.util.Random;

public final class BackgroundType {

    public final static void pickBackground(WritableRaster raster) {

        int[] bgColor = Image.getRandomBGColor();

        for (int x = 0; x < Config.FRAME_WIDTH; x++)
            for (int y = 0; y < Config.FRAME_HEIGHT; y++)
                raster.setPixel(x, y, bgColor);
    }
}
