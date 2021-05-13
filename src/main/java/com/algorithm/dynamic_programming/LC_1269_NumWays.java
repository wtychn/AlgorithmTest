package com.algorithm.dynamic_programming;
/***
 * @Description: 停在原地的方案数
 * @level hard
 * @author wtychn
 * @Date 2021/5/13
 */
public class LC_1269_NumWays {
    public int numWays(int steps, int arrLen) {
        int[] dp = new int[Math.min(arrLen, steps / 2 + 1)];
        dp[0] = 1;
        for (int i = 0; i < steps; i++) {
            int[] dpNext = new int[dp.length];
            for (int j = 0; j < dp.length; j++) {
                dpNext[j] = dp[j];
                if (j - 1 >= 0)
                    dpNext[j] = (dpNext[j] + dp[j - 1]) % 1000000007;
                if (j + 1 < arrLen)
                    dpNext[j] = (dpNext[j] + dp[j + 1]) % 1000000007;
            }
            dp = dpNext;
        }
        return dp[0] % 1000000007;
    }
}
