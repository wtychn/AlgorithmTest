package com.algorithm.dynamic_programming;
/***
 * @Description: 使用最小花费爬楼梯  
 * @level easy 
 * @author wtychn
 * @Date 2020/12/21
 */
public class LC_746_MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int dp1 = cost[0], dp2 = cost[1], dp = Math.min(dp1, dp2);
        for (int i = 2; i < cost.length; i++) {
            dp = Math.min(dp1 + cost[i], dp2 + cost[i]);
            dp1 = dp2;
            dp2 = dp;
        }
        return Math.min(dp, dp1);
    }
}
