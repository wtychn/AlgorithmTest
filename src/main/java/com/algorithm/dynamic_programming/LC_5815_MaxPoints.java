package com.algorithm.dynamic_programming;
/***
 * @Description: 扣分后的最大得分
 * @level mid
 * @author wtychn
 * @Date 2021/7/18
 */
public class LC_5815_MaxPoints {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        long[] dp = new long[n];
        long max = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = points[0][i];
            max = Math.max(max, dp[i]);
        }
        for (int k = 1; k < m; k++) {
            // left、right 两个数组存储的是扣分后的值
            long[] left = new long[n];
            long[] right = new long[n];

            left[0] = dp[0];
            for (int i = 1; i < n; i++) {
                left[i] = Math.max(left[i - 1] - 1, dp[i]);
            }

            right[n - 1] = dp[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                right[i] = Math.max(right[i + 1] - 1, dp[i]);
            }

            for (int i = 0; i < n; i++) {
                dp[i] = points[k][i] + Math.max(left[i], right[i]);
                if(k == m - 1) max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
