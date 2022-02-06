package main;

import java.awt.image.WritableRaster;
import java.util.Random;

public class EyeTypes {
    static void pickEye(WritableRaster raster, int type) {

        int[] eyeColor = EyeColors.pickEyeColor(new Random().nextInt(7));

        switch (type) {
            case 0:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++)
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++)
                        if (y == 6 && (x == 5 || x == 9)) raster.setPixel(x, y, eyeColor);
                break;

            case 1:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++)
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++)
                        if (y == 6 && ((x > 4 && x < 8) || (x > 8 && x < 12))) raster.setPixel(x, y, eyeColor);
                break;

            case 2:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3 && x < 7) || (x > 7 && x < 11))) raster.setPixel(x, y, eyeColor);
                        if ((y == 5 || y == 7) && (x == 5 || x == 9)) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 3:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3 && x < 7) || (x > 7 && x < 11))) raster.setPixel(x, y, eyeColor);
                        if (y == 5 && (x == 5 || x == 9)) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 4:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3 && x < 7) || (x > 7 && x < 11))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && (x == 5 || x == 9)) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 5:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3 && x < 7) || (x > 7 && x < 11))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && (x == 6 || x == 10)) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 6:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 5 && ((x == 4) || (x == 8))) raster.setPixel(x, y, eyeColor);
                        if ((y == 6 || y == 7) && ((x == 5) || (x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 7:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 5 && ((x == 4) || (x == 10))) raster.setPixel(x, y, eyeColor);
                        if ((y == 6 || y == 7) && ((x == 5) || (x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 8:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if ((y == 7 || y == 5) && ((x == 4) || (x == 10))) raster.setPixel(x, y, eyeColor);
                        if ((y == 6 || y == 7) && ((x == 5) || (x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 9:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 5 && ((x == 4) || (x == 10))) raster.setPixel(x, y, eyeColor);
                        if (y == 6 && ((x == 5 || x == 6) || (x == 9 || x == 8))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 10:
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 5 && ((x == 5) || (x == 9))) raster.setPixel(x, y, eyeColor);
                        if (y == 6 && (x == 4 || x == 10)) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

        }
    }
}
