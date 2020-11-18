package com.algorithm.array;

/***
 * @Description: 买卖股票获得的最大利润
 * @level easy
 * @author wtychn
 * @Date 2020/11/8
 */
public class LC_121_MaxProfit {
    public int maxProfit(int[] prices) {
        int s = 0, res = 0;
        for (int i = 1; i <= prices.length; i++) {
            if (i == prices.length || prices[i] < prices[i - 1]) {
                if(prices[i - 1] - prices[s] > 0)
                    res += prices[i - 1] - prices[s];
                s = i;
            }
        }
        return res;
    }
}
