package com.algorithm.array;

public class LC_5528_BestCoordinate {
    int[][] tow;
    int rad;
    public int[] bestCoordinate(int[][] towers, int radius) {
        tow = towers;
        rad = radius;
        int length = 100;
        int max = 0;
        int[] res = new int[2];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (getStrength(i, j) > max) {
                    max = getStrength(i, j);
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    private int getStrength(int x, int y) {
        int res = 0;
        for (int[] ints : tow) {
            int xt = ints[0], yt = ints[1], q = ints[2];
            double distance = Math.sqrt((x - xt) * (x - xt) + (y - yt) * (y - yt));
            if (distance <= rad)
                res += q / (1 + distance);
        }
        return res;
    }
}
