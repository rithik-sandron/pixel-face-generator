package resources.types;

import resources.colors.SkinColors;

import java.awt.image.WritableRaster;

public final class SkinTypes {

    public final static void pickSkin(WritableRaster raster) {

      int[] skinColor = SkinColors.pickSkinColor(Image.random.nextInt(5));
//        int[] skinColor = Image.getRandomColor();

        for (int x = 3; x < Config.FRAME_WIDTH - 3; x++)
            for (int y = 3; y < Config.FRAME_HEIGHT; y++) {
                if(y == Config.FRAME_HEIGHT-2 && (x == 3 || x == Config.FRAME_WIDTH-4));
                else if(y == Config.FRAME_HEIGHT-1 && (x == 3 || x == 4 | x == Config.FRAME_WIDTH - 5 || x == Config.FRAME_WIDTH-4));
                else raster.setPixel(x, y, skinColor);
            }
    }
}
