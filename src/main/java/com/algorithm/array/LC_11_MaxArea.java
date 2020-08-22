package com.algorithm.array;

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

    public int maxArea_DoublePointer(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            int area = height[left] < height[right] ?
                    (right - left) * height[left++] : (right - left) * height[right--];
            max = Math.max(max, area);
        }
        return max;
    }
}
