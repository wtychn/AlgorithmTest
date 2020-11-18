package com.algorithm.array;

import java.util.*;
/***
 * @Description: 与原点距离最近的 k 个点
 * @level mid
 * @author wtychn
 * @Date 2020/11/9
 */
public class LC_973_KClosest {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt((array) -> array[0] * array[0] + array[1] * array[1]));
        return Arrays.copyOf(points, K);
    }
}
