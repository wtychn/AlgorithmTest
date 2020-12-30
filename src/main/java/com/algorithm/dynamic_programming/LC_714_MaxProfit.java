package com.algorithm.dynamic_programming;
/* **
 * @Description: 最大利润  
 * @level mid 
 * @author wtychn
 * @Date 2020/12/30
 */
public class LC_714_MaxProfit {
    public int maxProfit(int[] prices, int fee) {
        int[] dp = new int[2]; // dp[0]为不持有的最大收益，dp[1]为持有的最大收益
        dp[1] = -prices[0];
        for (int price : prices) {
            dp[0] = Math.max(dp[0], price - dp[1] - fee);
            dp[1] = Math.max(dp[1], dp[0] - price);
        }
        return Math.max(dp[0], dp[1]);
    }
}
