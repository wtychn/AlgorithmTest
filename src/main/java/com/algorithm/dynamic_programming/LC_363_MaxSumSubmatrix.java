package com.algorithm.dynamic_programming;
/***
 * @Description: 矩形区域不超过 K 的最大数值和
 * @level hard
 * @author wtychn
 * @Date 2021/4/22
 */
public class LC_363_MaxSumSubmatrix {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int max = Integer.MIN_VALUE;
        for (int l = 0; l < matrix[0].length; l++) {
            int[] rowSum = new int[matrix.length];
            for (int r = l; r < matrix[0].length; r++) {
                for (int i = 0; i < rowSum.length; i++) {
                    rowSum[i] += matrix[i][r];
                }
                max = Math.max(lineMax(rowSum, k), max);
                if(max == k) return max;
            }
        }
        return max;
    }

    private int lineMax(int[] nums, int k) {
        // 先用 O(n)方法计算一遍
        int rowSum = nums[0], rowMax = rowSum;
        for (int i = 1; i < nums.length; i++) {
            if (rowSum > 0) rowSum += nums[i];
            else rowSum = nums[i];
            if (rowSum > rowMax) rowMax = rowSum;
        }
        if(rowMax <= k) return rowMax;
        // 上面方法不行再用 O(n^2)方法
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum > max && sum <= k) max = sum;
                if(max == k) return sum;
            }
        }
        return max;
    }
}
