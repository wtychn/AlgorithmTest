package com.algorithm.dynamic_programming;
/***
 * @Description: 组合总和4
 * @level mid
 * @author wtychn
 * @Date 2021/4/24
 */
public class LC_377_CombinationSum4 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if(i >= num) dp[i] += dp[i - num];
            }
        }
        return dp[target];
    }
}
