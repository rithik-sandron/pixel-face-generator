package to.ken.colors;

public final class HairColors {

    final static int[] PINK = new int[]{255, 102, 153, 160};
    final static int[] BROWN = new int[]{230, 138, 0, 160};
    final static int[] BLUE = new int[]{77, 166, 255, 160};
    final static int[] RED = new int[]{255, 77, 77, 160};
    final static int[] GREEN = new int[]{0, 204, 0, 160};

    public final static int[] pickHairColor(int type) {
        switch (type) {
            case 0:
                return HairColors.PINK;
            case 1:
                return HairColors.GREEN;
            case 2:
                return HairColors.BROWN;
            case 3:
                return HairColors.RED;
            case 4:
                return HairColors.BLUE;
        }
        return null;
    }
}
