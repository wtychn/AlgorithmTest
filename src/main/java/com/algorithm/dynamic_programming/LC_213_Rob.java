package com.algorithm.dynamic_programming;

import java.util.Arrays;
/***
 * @Description: 打家劫舍2  
 * @level mid 
 * @author wtychn
 * @Date 2021/4/15
 */
public class LC_213_Rob {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(dp(Arrays.copyOf(nums, nums.length - 1)),
                dp(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private int dp(int[] dp) {
        dp[1] = Math.max(dp[0], dp[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + dp[i], dp[i - 1]);
        }
        return dp[dp.length - 1];
    }
}
