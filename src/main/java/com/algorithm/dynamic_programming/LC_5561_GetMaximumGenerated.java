package com.algorithm.dynamic_programming;
/***
 * @Description: 动态规划生成数列并查找数列最大值
 * @level easy
 * @author wtychn
 * @Date 2020/11/8
 */
public class LC_5561_GetMaximumGenerated {
    public int getMaximumGenerated(int n) {
        if (n < 2) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        int max = 0;
        for (int i = 2; i <= n; i++) {
            if(i % 2 == 0) dp[i] = dp[i / 2];
            else dp[i] = dp[(i - 1) / 2] + dp[(i - 1) / 2 + 1];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
