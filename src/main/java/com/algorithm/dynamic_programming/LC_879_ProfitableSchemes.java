package com.algorithm.dynamic_programming;
/***
 * @Description: 盈利计划
 * @level hard
 * @author wtychn
 * @Date 2021/6/9
 */
public class LC_879_ProfitableSchemes {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int length = group.length;
        int MOD = 1000000007;
        // dp[j][k] 存储人数为 j, 收益为 k 的方案数
        int[][] dp = new int[n + 1][minProfit + 1];
        dp[0][0] = 1;
        for (int i = 0; i < length; i++) {
            for (int j = n; j >= group[i]; j--) {
                for (int k = minProfit; k >= 0; k--) {
                    // Math.max(0, k - profit[i]) 表示利润超过最低限制也可以加进来
                    dp[j][k] += dp[j - group[i]][Math.max(0, k - profit[i])];
                    dp[j][k] -= dp[j][k] >= MOD ? MOD : 0;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += dp[i][minProfit];
            sum -= sum >= MOD ? MOD : 0;
        }
        return sum;
    }
}
