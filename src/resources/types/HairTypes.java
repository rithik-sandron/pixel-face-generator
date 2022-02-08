package resources.types;

import java.awt.image.WritableRaster;
import java.util.Arrays;

public final class HairTypes {

    public final static void pickHair(WritableRaster raster, int type) {

//       int[] hairColor = HairColors.pickHairColor(new Random().nextInt(5));
//       int[] hairColorSide = Arrays.copyOf(hairColor, 4);
//       hairColorSide[3] = 10;

        int[] hairColor = Image.getRandomColor();
        int[] hairColorSide = Arrays.copyOf(hairColor, 4);
        hairColorSide[3] = 10;

        switch (type) {
            case 1:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 3 && (x > 2 && x < 9)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 2 && x < 10)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 2:
                // type 2
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 3 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 4 && x < 10)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x == 7)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 3:
                // type 2
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
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

            case 5:
                // type 2
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 4 || y == 5) && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 3 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 3 && (x == 2 || x == 3 || x == 11 || x == 12)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 6:
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

            case 7:
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

            case 8:
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

            case 0:
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

            case 9:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 4 || y == 5) && x == 2) raster.setPixel(x, y, hairColor);
                        if (y == 3 && (x > 1 && x < 11)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 1 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 5 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 9 && x < 13)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 10:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 3 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 1 && (x > 0 && x < 12 && x % 2 == 0)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 0 && x < 11 && x % 2 == 1)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 11:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 1 || y == 2 || y == 3) && (x > 2 && x < 12)) raster.setPixel(x, y, hairColor);
                        if (y == 0 && (x > 2 && x < 12 && x % 2 == 1)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 12:
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

            case 13:
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

            case 14:
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

            case 15:
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

            case 16:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y > 0 && y < 5) && (x < 3)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y == 4 || y == 5) && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 17:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y > 1 && y < 12) && (x < 3)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y == 4 || y == 5) && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 18:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y > 1 && y < 12) && (x < 2)) raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y == 4 || y == 5) && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;

            case 19:
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

            case 20:
                // type 1
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 1) && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                        if ((y == 0) && (x == 6 || x == 5 || x == 4 || x == 3 || x == 8 || x == 9 || x == 10 || x == 11))
                            raster.setPixel(x, y, hairColor);
                        if ((y == 3 || y == 4) && (x == 2 || x == 12)) raster.setPixel(x, y, hairColor);
                        if ((y == 4) && (x == 3 || x == 11)) raster.setPixel(x, y, hairColor);
                        if (y == 2 && (x > 1 && x < 13)) raster.setPixel(x, y, hairColor);
                    }
                }
                break;
        }
    }
}
