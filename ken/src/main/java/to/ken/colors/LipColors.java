package to.ken.colors;

public final class LipColors {
    final static int[] PINK = new int[]{255, 102, 153, 200};
    final static int[] BROWN1 = new int[]{255, 166, 77, 200};
    final static int[] BROWN2 = new int[]{153, 102, 51, 200};
    final static int[] BLUE = new int[]{77, 166, 255, 160};
    final static int[] PURPLE = new int[]{204, 153, 255, 200};
    final static int[] TEETH = new int[]{255, 255, 255, 200};

    public final static int[] pickLipColor(int type) {
        switch (type) {
            case 0:
                return LipColors.PINK;
            case 1:
                return LipColors.BROWN1;
            case 2:
                return LipColors.BROWN2;
            case 3:
                return LipColors.BLUE;
            case 4:
                return LipColors.PURPLE;
        }
        return null;
    }
}
