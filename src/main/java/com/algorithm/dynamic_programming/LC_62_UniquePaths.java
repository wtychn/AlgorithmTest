package com.algorithm.dynamic_programming;

import java.util.Arrays;
/***
 * @Description: 计算路径总数
 * @level mid
 * @author wtychn
 * @Date 2020/12/9
 */
public class LC_62_UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}
