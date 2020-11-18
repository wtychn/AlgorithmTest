package com.algorithm.array;

/**
 * @program: AlgorithmTest
 * @description: offer63
 * @author: Mr.Wang
 * @create: 2020-08-01 12:33
 **/
public class Offer_63_MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int profit = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}
