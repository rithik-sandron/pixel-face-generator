package main;

import java.awt.image.WritableRaster;
import java.util.Random;

public class HairTypes {

    static void pickHair(WritableRaster raster, int type) {

        int[] hairColor = HairColors.pickHairColor(new Random().nextInt(5));

        switch (type) {
            case 1:
                // type 1
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 3 && (x > 2 && x < 9)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 2 && x < 10)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 2:
                // type 2
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 3 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 4 && x < 10)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x == 7)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 3:
                // type 2
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 0 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 3 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 4 && (x < 6 && x > 8)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 4:
                // type 2
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 0 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 3 && (x == 3 || x == 4 || x == 10 || x == 11)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 5:
                // type 2
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 0 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 3 && (x == 3 || x == 11)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 6:
                // type 2
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 0 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);

                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y ==4 || y == 5) && (x == 2 || x == 3 || x == 11 || x == 12)) raster.setPixel(x, y, hairColor);

                        if (y == 6 && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 7 && (x == 1 || x == 13)) raster.setPixel(x, y, hairColor);
                        if (y == 8 && (x == 0 || x == 14)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 7:
                // type 2
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 0 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);

                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y ==4 || y == 5 || y == 6) && (x == 3 || x== 2 || x== 12 || x == 11)) raster.setPixel(x, y, hairColor);

                        if ((y == 7 || y == 8)  && (x == 3 || x == 2 || x== 12 || x == 11)) raster.setPixel(x, y, hairColor);

                        if ((y == 10 || y == 9) && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 11 && (x == 2 || x == 3 || x == 11 || x == 12)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 8:
                // type 2
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 0 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);

                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y ==4 || y == 5 || y == 6) && (x == 3 || x== 2 || x== 12 || x == 11)) raster.setPixel(x, y, hairColor);

                        if ((y == 7 || y == 8 || y == 9)  && (x == 3 || x == 2 || x== 12 || x == 11)) raster.setPixel(x, y, hairColor);

                        if (y == 10 && (x == 2 || x == 1 || x == 13 || x == 12)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 0:
                // type 2
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 0 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);

                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y ==4 || y == 5 || y == 6) && (x == 3 || x== 2 || x== 12 || x == 11)) raster.setPixel(x, y, hairColor);

                        if ((y == 7 || y == 8 || y == 9)  && (x == 3 || x == 2 || x== 12 || x == 11)) raster.setPixel(x, y, hairColor);

                        if (y == 10 && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 11 && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 12 && (x == 1 || x == 2 || x == 12 || x == 13)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 9:
                // type 1
                for (int x = 0; x < PixelCharacter.FRAME_WIDTH; x++) {
                    for (int y = 0; y < PixelCharacter.FRAME_HEIGHT; y++) {
                        if (y == 3 && (x > 2 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 5 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 9 && x < 12)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;
        }
    }
}
