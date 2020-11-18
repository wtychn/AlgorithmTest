package com.algorithm.array;

import java.util.Arrays;
/***
 * @Description: 将 x 减到 0 的最小操作数
 * @level mid
 * @author wtychn
 * @Date 2020/11/15
 */
public class LC_5603_MinOperations {
    // 使用滑动窗口找中间最长的片段使得sum(中间片段)=sum(nums)-x
    public int minOperations(int[] nums, int x) {
        int curSum = 0, left = 0, right = 0, maxLength = -1;
        int sum = Arrays.stream(nums).sum();
        // 滑动窗口找到所有符合条件的中间片段
        while (right < nums.length) {
            curSum += nums[right++];

            while (curSum > sum - x && left < nums.length) {
                curSum -= nums[left++];
            }

            if (curSum == sum - x) {
                maxLength = Math.max(maxLength, right - left);
            }
        }
        return maxLength == -1 ? -1 : nums.length - maxLength;
    }

}
