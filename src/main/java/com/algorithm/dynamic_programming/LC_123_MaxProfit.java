package com.algorithm.dynamic_programming;

public class LC_123_MaxProfit {
    public int maxProfit(int[] prices) {
        int buy1 = -prices[0], sell1 = 0; //记录第一次买入和卖出的最优值
        int buy2 = -prices[0], sell2 = 0; //记录第二次买入和卖出的最优值
        for (int i = 1; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }
}
