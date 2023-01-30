package to.ken.colors;

public final class SkinColors {

    final static int[] SKIN1 = new int[]{245, 187, 149, 230};
    final static int[] SKIN2 = new int[]{250, 187, 134, 230};
    final static int[] SKIN3 = new int[]{250, 220, 196, 230};
    final static int[] SKIN4 = new int[]{205, 110, 66, 230};
    final static int[] SKIN5 = new int[]{20, 13, 6, 230};

    public final static int[] pickSkinColor(int type) {
        switch (type) {
            case 0:
                return SkinColors.SKIN5;
            case 1:
                return SkinColors.SKIN1;
            case 2:
                return SkinColors.SKIN2;
            case 3:
                return SkinColors.SKIN3;
            case 4:
                return SkinColors.SKIN4;

        }
        return null;
    }

}
