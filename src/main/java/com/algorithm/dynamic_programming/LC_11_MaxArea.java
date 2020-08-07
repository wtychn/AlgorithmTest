package com.algorithm.dynamic_programming;

import java.util.concurrent.ForkJoinPool;

/**
 * @program: AlgorithmTest
 * @description: lc11
 * @author: Mr.Wang
 * @create: 2020-08-07 10:25
 **/
public class LC_11_MaxArea {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 1; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                int area = (i - j) * Math.min(height[i], height[j]);
                max = Math.max(max, area);
            }
        }
        return max;
    }
}
