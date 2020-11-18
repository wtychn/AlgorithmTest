package com.algorithm.array;

import java.util.Arrays;
import java.util.Comparator;
/***
 * @Description: 寻找点之间的最大横向距离
 * @level mid
 * @author wtychn
 * @Date 2020/11/1
 */
public class LC_5540_MaxWidthOfVerticalArea {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int max = 0;
        for (int i = 1; i < points.length; i++) {
            max = Math.max(max, points[i][0] - points[i - 1][0]);
        }
        return max;
    }
}
