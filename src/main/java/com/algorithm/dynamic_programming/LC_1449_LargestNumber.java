package com.algorithm.dynamic_programming;

import java.util.Arrays;
/***
 * @Description: 数位成本和为目标值的最大数字
 * @level hard
 * @author wtychn
 * @Date 2021/6/12
 */
public class LC_1449_LargestNumber {
    public String largestNumber(int[] cost, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;
        for (int c : cost) {
            for (int i = c; i <= target; i++) {
                dp[i] = Math.max(dp[i], dp[i - c] + 1);
            }
        }
        if(dp[target] < 0) return "0";
        StringBuilder sb = new StringBuilder();
        for (int i = 8, j = target; i >= target; i--) {
            for (int c = cost[i]; j >= c && dp[j] == dp[j - c] + 1; j -= c) {
                sb.append(i + 1);
            }
        }
        return sb.toString();
    }
}
