package com.algorithm.array;

import java.util.Arrays;
import java.util.Comparator;
/***
 * @Description: 计算范围重叠的数组个数（用最少的箭引爆气球）
 * @level mid
 * @author wtychn
 * @Date 2020/11/24
 */
public class LC_425_FindMinArrowShots {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        int res = 0;
        int cur = 0, traver;
        Arrays.sort(points, Comparator.comparingInt(point -> point[1]));
        while (cur < points.length) {
            traver = cur + 1;
            while (traver < points.length && points[traver][0] <= points[cur][1]) {
                traver++;
            }
            cur = traver;
            res++;
        }
        return res == 0 ? 1 : res;
    }
}
