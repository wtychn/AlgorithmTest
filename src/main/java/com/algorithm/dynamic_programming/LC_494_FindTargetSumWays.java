package com.algorithm.dynamic_programming;

import java.util.Arrays;
/***
 * @Description: 目标和
 * @level mid
 * @author wtychn
 * @Date 2021/6/7
 */
public class LC_494_FindTargetSumWays {
    int[] nums;
    int count;
    int target;

    public int findTargetSumWays(int[] nums, int target) {
        this.nums = nums;
        count = 0;
        this.target = target;
        dfs(0, 0);
        return count;
    }

    private void dfs(int idx, int sum) {
        if (idx == nums.length) {
            if (sum == target) count++;
            return;
        }
        dfs(idx + 1, sum + nums[idx]);
        dfs(idx + 1, sum - nums[idx]);
    }

    public int findTargetSumWays_dp(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        // (sum − neg) − neg = sum − 2 ⋅ neg = target
        // neg = (sum - target) / 2
        // 添加 - 号的元素之和为 neg
        int diff = sum - target;
        if(diff < 0 || diff % 2 != 0) return 0;
        int neg = diff / 2;
        // dp[i] 数组存放的是和为 i 时的方案数
        int[] dp = new int[neg + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = neg; j >= num; j--)
                dp[j] += dp[j - num];
        }
        return dp[neg];
    }
}
