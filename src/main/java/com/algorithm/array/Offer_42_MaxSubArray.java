package com.algorithm.array;

public class Offer_42_MaxSubArray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
//        直接用nums[]来替代动态规划所需要的dp[],记录当前位置的最大子序和
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
