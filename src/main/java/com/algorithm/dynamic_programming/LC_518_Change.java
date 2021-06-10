package com.algorithm.dynamic_programming;
/***
 * @Description: 零钱兑换
 * @level mid
 * @author wtychn
 * @Date 2021/6/10
 */
public class LC_518_Change {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
