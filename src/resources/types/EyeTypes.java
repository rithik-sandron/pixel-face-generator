package resources.types;

import resources.colors.EyeColors;

import java.awt.image.WritableRaster;
import java.util.Random;

public final class EyeTypes {
    public final static void pickEye(WritableRaster raster, int type) {

//        int[] eyeColor = EyeColors.pickEyeColor(new Random().nextInt(7));
        int[] eyeColor = Image.getRandomColor();
        int[] eyeColor2 = Image.getRandomColor();

        switch (type) {
            case 0:
                for (int x = 0; x < Config.FRAME_WIDTH; x++)
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++)
                        if (y == 6 && (x == 5 || x == 9)) raster.setPixel(x, y, eyeColor);
                break;

            case 1:
                for (int x = 0; x < Config.FRAME_WIDTH; x++)
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++)
                        if (y == 6 && ((x > 4 && x < 8) || (x > 8 && x < 12))) raster.setPixel(x, y, eyeColor);
                break;

            case 2:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3 && x < 7) || (x > 7 && x < 11))) raster.setPixel(x, y, eyeColor);
                        if ((y == 5 || y == 7) && (x == 5 || x == 9)) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 3:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3 && x < 7) || (x > 7 && x < 11))) raster.setPixel(x, y, eyeColor);
                        if (y == 5 && (x == 5 || x == 9)) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 4:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3 && x < 7) || (x > 7 && x < 11))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && (x == 5 || x == 9)) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 5:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3 && x < 7) || (x > 7 && x < 11))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && (x == 6 || x == 10)) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 6:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 5 && ((x == 4) || (x == 8))) raster.setPixel(x, y, eyeColor);
                        if ((y == 6 || y == 7) && ((x == 5) || (x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 7:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 5 && ((x == 5) || (x == 9))) raster.setPixel(x, y, eyeColor);
                        if ((y == 6 || y == 7) && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 8:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 7 || y == 5) && ((x == 5) || (x == 9))) raster.setPixel(x, y, eyeColor);
                        if ((y == 6 || y == 7) && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 9:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 5 && ((x == 4) || (x == 10))) raster.setPixel(x, y, eyeColor);
                        if (y == 6 && ((x == 5 || x == 6) || (x == 9 || x == 8))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 10:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 5 && ((x == 5) || (x == 9))) raster.setPixel(x, y, eyeColor);
                        if (y == 6 && (x == 4 || x == 10)) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 11:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 7 || y == 5) && ((x == 6) || (x == 9))) raster.setPixel(x, y, eyeColor);
                        if ((y == 6 || y == 7) && ((x == 5) || (x == 8))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 12:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x == 4 || x == 6) || (x == 8 || x == 10))) raster.setPixel(x, y, eyeColor);
                        if (y == 6 && ((x == 5) || (x == 9))) raster.setPixel(x, y, eyeColor2);
                    }
                }
                break;

            case 13:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x == 5 || x == 6) || (x == 8 || x == 9))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 5 || x == 6) || (x == 8 || x == 9))) raster.setPixel(x, y, eyeColor2);
                    }
                }
                break;

            case 14:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x == 5) || (x == 8))) raster.setPixel(x, y, eyeColor);
                        if (y == 6 && ((x == 6) || ( x == 9))) raster.setPixel(x, y, eyeColor2);
                        if (y == 7 && ((x == 5 || x == 6) || (x == 8 || x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 15:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x == 5) || (x == 8))) raster.setPixel(x, y, eyeColor2);
                        if (y == 6 && ((x == 6) || ( x == 9))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 5 || x == 6) || (x == 8 || x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 16:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 7 && ((x == 5) || (x == 8))) raster.setPixel(x, y, eyeColor2);
                        if (y == 7 && ((x == 6) || ( x == 9))) raster.setPixel(x, y, eyeColor);
                        if (y == 6 && ((x == 5 || x == 6) || (x == 8 || x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 17:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 7 && ((x == 5) || (x == 8))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 6) || ( x == 9))) raster.setPixel(x, y, eyeColor2);
                        if (y == 6 && ((x == 5 || x == 6) || (x == 8 || x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 18:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 7 && ((x == 6) || ( x == 8))) raster.setPixel(x, y, eyeColor2);
                        if (y == 6 && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 19:
                for (int x = 0; x < Config.FRAME_WIDTH; x++)
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++)
                        if (y == 6 && (x == 6 || x == 8)) raster.setPixel(x, y, eyeColor);
                break;

            case 20:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 7 && ((x == 6) || ( x == 8))) raster.setPixel(x, y, eyeColor2);
                        if (y == 6 && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor);
                        if (y == 5 && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 21:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 7 && ((x == 6) || ( x == 8))) raster.setPixel(x, y, eyeColor);
                        if (y == 6 && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor2);
                        if (y == 5 && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 22:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 7 && ((x == 6) || ( x == 8))) raster.setPixel(x, y, eyeColor);
                        if (y == 6 && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor);
                        if (y == 5 && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor2);
                    }
                }
                break;

            case 23:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 4) && (x < 10))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 5 || x == 6) || (x == 8 || x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 24:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3) && (x < 11) && (x != 7))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 4 || x == 5) || (x == 10 || x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 25:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3) && (x < 11))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 4 || x == 5) || (x == 10 || x == 9))) raster.setPixel(x, y, eyeColor);
                        if (y == 5 && ((x == 4 || x == 5) || (x == 10 || x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 26:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3) && (x < 11))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 4 || x == 5 || x == 6) || (x == 10 || x == 8 || x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 27:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3) && (x < 11))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 4 || x == 5 || x == 6) || (x == 10 || x == 8 || x == 9))) raster.setPixel(x, y, eyeColor);
                        if (y == 5 && ((x == 4 || x == 5 || x == 6) || (x == 10 || x == 8 || x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 28:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3) && (x < 11))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 4 || x == 5 || x == 6) || (x == 10 || x == 8 || x == 9))) raster.setPixel(x, y, eyeColor);
                        if (y == 5 && ((x == 4) || (x == 10))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 29:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3) && (x < 11))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 4 || x == 5 || x == 6) || (x == 10 || x == 8 || x == 9))) raster.setPixel(x, y, eyeColor);
                        if (y == 5 && ((x > 3) && (x < 11))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 30:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x == 6) || (x == 8))) raster.setPixel(x, y, eyeColor);
                        if (y == 6 && ((x == 5) || ( x == 9))) raster.setPixel(x, y, eyeColor2);
                        if (y == 7 && ((x == 5 || x == 6) || (x == 8 || x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 31:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3) && (x < 11) && (x != 8))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 4 || x == 5) || (x == 10 || x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;

            case 32:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 6 && ((x > 3) && (x < 11) && (x != 6))) raster.setPixel(x, y, eyeColor);
                        if (y == 7 && ((x == 4 || x == 5) || (x == 10 || x == 9))) raster.setPixel(x, y, eyeColor);
                    }
                }
                break;


        }
    }
}
