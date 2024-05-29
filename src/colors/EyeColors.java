package colors;

public final class EyeColors {

    private final static int[] BLACK = new int[]{128, 128, 128, 220};
    private final static int[] BROWN = new int[]{255, 163, 26, 220};
    private final static int[] BLUE = new int[]{77, 166, 255, 220};
    private final static int[] RED = new int[]{255, 77, 77, 220};
    private final static int[] GREEN = new int[]{0, 204, 0, 220};
    private final static int[] YELLOW = new int[]{255, 207, 63, 220};
    private final static int[] PINK = new int[]{255, 128, 255, 220};

    public final static int[] pickEyeColor(int type) {
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
