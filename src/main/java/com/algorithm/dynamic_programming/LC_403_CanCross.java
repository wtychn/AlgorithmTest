package com.algorithm.dynamic_programming;
/***
 * @Description: 青蛙过河
 * @level hard
 * @author wtychn
 * @Date 2021/4/29
 */
public class LC_403_CanCross {
    public boolean canCross(int[] stones) {
        if(stones[1] != 1) return false;
        int n = stones.length;
        if(n == 2) return true;
        boolean[][] dp = new boolean[n][n];
        dp[1][1] = true;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                int k = stones[i] - stones[j];
                if (k <= j + 1) {
                    dp[i][k] = dp[j][k - 1] || dp[j][k] || dp[j][k + 1];
                    if(i == n - 1 && dp[i][k]) return true;
                }
            }
        }
        return false;
    }
}
