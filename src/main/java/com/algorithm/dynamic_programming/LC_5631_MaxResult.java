package com.algorithm.dynamic_programming;

import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
/***
 * @Description: 跳跃游戏6  
 * @level mid 
 * @author wtychn
 * @Date 2020/12/20
 */
public class LC_5631_MaxResult {
    public int maxResult(int[] nums, int k) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        TreeSet<Integer> sortMax = new TreeSet<>();
        sortMax.add(dp[0]);
        for (int i = 1; i < Math.min(k, nums.length); i++) {
            dp[i] = sortMax.last() + nums[i];
            sortMax.add(dp[i]);
        }
        for (int i = k; i < nums.length; i++) {
            dp[i] = sortMax.last() + nums[i];
            if (dp[i - k] == sortMax.last()) {
                sortMax.pollLast();
            }
            sortMax.add(dp[i]);
        }
        return dp[nums.length - 1];
    }
}
