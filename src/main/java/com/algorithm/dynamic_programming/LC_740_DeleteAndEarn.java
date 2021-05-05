package com.algorithm.dynamic_programming;
/***
 * @Description: 删除并获得点数
 * @level mid
 * @author wtychn
 * @Date 2021/5/5
 */
public class LC_740_DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] freq = new int[10001];
        int max = 0;
        for (int num : nums) {
            freq[num]++;
            max = Math.max(max, num);
        }
        int[] dp = new int[max + 1];
        dp[1] = freq[1]; // freq[1] * 1
        dp[2] = Math.max(dp[1], freq[2] * 2);
        for (int i = 3; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + freq[i] * i);
        }
        return dp[max];
    }
}
