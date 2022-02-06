package main;

import java.awt.image.WritableRaster;
import java.util.Random;

public class LipTypes {

    static void pickLip(WritableRaster raster, int type) {

        int[] lipColor = LipColors.pickLipColor(new Random().nextInt(5));
        switch (type) {
            case 0:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++)
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++)
                        if (y == 10 && (x > 5 && x < 9))
                            raster.setPixel(x, y, lipColor);
                break;

            case 1:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++)
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++)
                        if (y == 10 && (x == 7)) raster.setPixel(x, y, lipColor);
                break;

            case 2:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 10 && (x == 6 || x == 8))
                            raster.setPixel(x, y, lipColor);
                        if (y == 11 && (x > 5 && x < 9))
                            raster.setPixel(x, y, lipColor);
                    }
                }
                break;

            case 3:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if ((y == 10 || y == 11) && (x > 5 && x < 9))
                            raster.setPixel(x, y, LipColors.TEETH);
                    }
                }
                break;

            case 4:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if ((y == 10 || y == 11) && (x > 6 && x < 8))
                            raster.setPixel(x, y, LipColors.TEETH);
                    }
                }
                break;

            case 5:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 10 && x == 6) raster.setPixel(x, y, lipColor);
                        if (y == 11 && x == 7) raster.setPixel(x, y, lipColor);
                        if (y == 10 && x == 8) raster.setPixel(x, y, lipColor);
                    }
                }
                break;

            case 6:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 11 && x == 8) raster.setPixel(x, y, LipColors.TEETH);
                    }
                }
                break;

            case 7:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 10 && (x == 5 || x == 9))
                            raster.setPixel(x, y, lipColor);
                        if (y == 11 && (x > 5 && x < 9))
                            raster.setPixel(x, y, lipColor);
                    }
                }
                break;
        }
    }
}
