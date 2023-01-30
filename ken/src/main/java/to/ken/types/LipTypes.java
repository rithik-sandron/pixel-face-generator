package to.ken.types;

import java.awt.image.WritableRaster;

public final class LipTypes {

    public final static void pickLip(WritableRaster raster, int type) {

//      int[] lipColor = LipColors.pickLipColor(new Random().nextInt(5));
        int[] lipColor = Image.getRandomColor();

        switch (type) {
            case 0:
                for (int x = 0; x < Config.FRAME_WIDTH; x++)
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++)
                        if (y == 10 && (x > 5 && x < 9))
                            raster.setPixel(x, y, lipColor);
                break;

            case 1:
                for (int x = 0; x < Config.FRAME_WIDTH; x++)
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++)
                        if (y == 10 && (x == 7)) raster.setPixel(x, y, lipColor);
                break;

            case 2:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 10 && (x == 6 || x == 8))
                            raster.setPixel(x, y, lipColor);
                        if (y == 11 && (x > 5 && x < 9))
                            raster.setPixel(x, y, lipColor);
                    }
                }
                break;

            case 3:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 10 || y == 11) && (x > 5 && x < 9))
                            raster.setPixel(x, y, lipColor);
                    }
                }
                break;

            case 4:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if ((y == 10 || y == 11) && (x > 6 && x < 8))
                            raster.setPixel(x, y, lipColor);
                    }
                }
                break;

            case 5:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 11 && (x > 5 && x < 9)) raster.setPixel(x, y, lipColor);
                        if (y == 10 && x == 7) raster.setPixel(x, y, lipColor);
                    }
                }
                break;

            case 6:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 10 && (x > 5 && x < 9)) raster.setPixel(x, y, lipColor);
                        if (y == 11 && x == 7) raster.setPixel(x, y, lipColor);
                    }
                }
                break;

            case 7:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 11 && x == 8) raster.setPixel(x, y, lipColor);
                    }
                }
                break;

            case 8:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 10 && (x == 5 || x == 9))
                            raster.setPixel(x, y, lipColor);
                        if (y == 11 && (x > 4 && x < 10))
                            raster.setPixel(x, y, lipColor);
                    }
                }
                break;

            case 9:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 10 && (x == 5 || x == 9))
                            raster.setPixel(x, y, lipColor);
                        if (y == 9 && (x > 4 && x < 10))
                            raster.setPixel(x, y, lipColor);
                    }
                }
                break;

            case 10:
                for (int x = 0; x < Config.FRAME_WIDTH; x++)
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++)
                        if (y == 10 && (x > 6 && x < 9)) raster.setPixel(x, y, lipColor);
                break;

            case 11:
                for (int x = 0; x < Config.FRAME_WIDTH; x++)
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++)
                        if (y == 10 && (x > 5 && x < 8)) raster.setPixel(x, y, lipColor);
                break;

            case 12:
                for (int x = 0; x < Config.FRAME_WIDTH; x++)
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++)
                        if (y == 10 && (x > 4 && x < 10)) raster.setPixel(x, y, lipColor);
                break;

            case 13:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 10 && (x > 4 && x < 10)) raster.setPixel(x, y, lipColor);
                        if (y == 11 && (x > 5 && x < 9)) raster.setPixel(x, y, lipColor);
                    }
                }
                break;

            case 14:
                for (int x = 0; x < Config.FRAME_WIDTH; x++) {
                    for (int y = 0; y < Config.FRAME_HEIGHT; y++) {
                        if (y == 9 && (x > 4 && x < 10)) raster.setPixel(x, y, lipColor);
                        if (y == 10 && (x > 5 && x < 9)) raster.setPixel(x, y, lipColor);
                        if (y == 11 && (x > 6 && x < 8)) raster.setPixel(x, y, lipColor);
                    }
                }
                break;

            case 15:
                break;
        }
    }
}
