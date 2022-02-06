package main;

public class EyeColors {

    final static int[] BLACK = new int[]{0, 0, 0, 220};
    final static int[] BROWN = new int[]{255, 163, 26, 220};
    final static int[] BLUE = new int[]{77, 166, 255, 220};
    final static int[] RED = new int[]{255, 77, 77, 220};
    final static int[] GREEN = new int[]{0, 204, 0, 220};
    final static int[] YELLOW = new int[]{255, 224, 102, 220};
    final static int[] PINK = new int[]{255, 128, 255, 220};


    static int[] pickEyeColor(int type) {
        switch (type) {
            case 0:
                return EyeColors.BLACK;
            case 1:
                return EyeColors.GREEN;
            case 2:
                return EyeColors.BROWN;
            case 3:
                return EyeColors.RED;
            case 4:
                return EyeColors.BLUE;
            case 5:
                return EyeColors.YELLOW;
            case 6:
                return EyeColors.PINK;
        }
        return null;
    }
}
