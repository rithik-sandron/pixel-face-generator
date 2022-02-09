package resources.types;

import java.awt.image.WritableRaster;
import java.util.Arrays;

public final class FemaleAndUnisexHairs {

    public final static void pickHair(WritableRaster raster, int type) {

//       int[] hairColor = HairColors.pickHairColor(new Random().nextInt(5));
//       int[] hairColorSide = Arrays.copyOf(hairColor, 4);
//       hairColorSide[3] = 10;

        int[] hairColor = Image.getRandomColor();
        int[] hairColorSide = Arrays.copyOf(hairColor, 4);
        hairColorSide[3] = 10;

        switch (type) {
// U
            case 0:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 3 && (x > 2 && x < 9)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 2 && x < 10)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;


// F
            case 1:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 4 || y == 5) && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 3 && (x == 2 || x == 3 || x == 4 || x == 10 || x == 11 || x == 12))
                            raster.setPixel(x, y, hairColor);
                    }
                }
                break;

// F
            case 2:
                // type 2
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 0 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);

                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y == 4 || y == 5) && (x == 2 || x == 3 || x == 11 || x == 12))
                            raster.setPixel(x, y, hairColor);

                        if (y == 6 && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 7 && (x == 1 || x == 13)) raster.setPixel(x, y, hairColor);
                        if (y == 8 && (x == 0 || x == 14)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;
// F
            case 3:
                // type 2
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 0 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);

                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y == 4 || y == 5 || y == 6) && (x == 3 || x == 2 || x == 12 || x == 11))
                            raster.setPixel(x, y, hairColor);

                        if ((y == 7 || y == 8 || y == 10 || y == 9) && (x == 3 || x == 2 || x == 12 || x == 11))
                            raster.setPixel(x, y, hairColor);

                        if (y == 11 && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 12 && (x == 2 || x == 3 || x == 11 || x == 12)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;
// U
            case 4:
                // type 2
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 0 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);

                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y == 4 || y == 5 || y == 6) && (x == 3 || x == 2 || x == 12 || x == 11))
                            raster.setPixel(x, y, hairColor);

                        if ((y == 7 || y == 8 || y == 9 || y == 10) && (x == 3 || x == 2 || x == 12 || x == 11))
                            raster.setPixel(x, y, hairColor);

                        if (y == 10 && (x == 1 || x == 13)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;
// F
            case 5:
                // type 2
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 0 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);

                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y == 4 || y == 5 || y == 6) && (x == 3 || x == 2 || x == 12 || x == 11))
                            raster.setPixel(x, y, hairColor);

                        if ((y == 7 || y == 8 || y == 9 || y == 10) && (x == 3 || x == 2 || x == 12 || x == 11))
                            raster.setPixel(x, y, hairColor);

                        if (y == 11 && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 12 && (x == 1 || x == 2 || x == 12 || x == 13)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;


// U
            case 6:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 3) && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 4 && x < 10)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 2 && x < 12 && x % 2 == 1)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;
// U
            case 7:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 3) && (x > 2 && x < 12 || x == 0 || x == 14)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 4 && x < 10 || x == 1 || x == 13)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && ((x == 2 || x == 12) || (x > 4 && x < 10))) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 0 && x < 14 && (x % 2 == 1 || x == 4 || x == 10)))
                            raster.setPixel(x, y, hairColor);
                    }
                }
                break;
// U
            case 8:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 3) && (x > 2 && x < 12 || x == 0 || x == 14)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > -1 && x < 15)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 4 && x < 10)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;
// F
            case 9:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 4 || y == 5) && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 0 && x < 14)) raster.setPixel(x, y, hairColor);
                        if ((y == 1 || y == 3) && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 4 && x < 10)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;
// F
            case 10:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y > 0 && y < 5) && (x < 3)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y == 4 || y == 5) && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;
// F
            case 11:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y > 1 && y < 12) && (x < 3)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y == 4 || y == 5) && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;
// F
            case 12:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y > 1 && y < 12) && (x < 2)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y == 4 || y == 5) && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;
// F
            case 13:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 11) && (x == 0)) raster.setPixel(x, y, hairColor);
                        if ((y > 1 && y < 12) && (x > 0 && x < 3)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y == 4 || y == 5) && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

        }
    }
}
