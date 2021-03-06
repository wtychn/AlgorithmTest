package com.algorithm.dynamic_programming;

import java.util.ArrayList;
import java.util.List;

/***
 * @Description: 完全平方数
 * @level mid
 * @author wtychn
 * @Date 2021/6/11
 */
public class LC_279_NumSquares {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; i - j * j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
