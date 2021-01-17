package com.algorithm.array;

import java.util.*;
/***
 * @Description: 重新排列后的最大子矩阵
 * @level mid
 * @author wtychn
 * @Date 2021/1/17
 */
public class LC_5655_LargestSubmatrix {
    public int largestSubmatrix(int[][] matrix) {
        int res = 0;
        int[] deepSum = new int[matrix[0].length];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                deepSum[j] = ints[j] == 0 ? 0 : deepSum[j] + 1;
            }
            int[] newSum = Arrays.copyOf(deepSum, deepSum.length);
            Arrays.sort(newSum);
            for (int j = newSum.length - 1; j >= 0; j--) {
                res = Math.max(res, (newSum.length - j) * newSum[j]);
            }
        }
        return res;
    }
}
