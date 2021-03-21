package com.algorithm.array;
/***
 * @Description: 最大升序子数组和  
 * @level easy 
 * @author wtychn
 * @Date 2021/3/21
 */
public class LC_5709_MaxAscendingSum {
    public int maxAscendingSum(int[] nums) {
        int left = 0, max = 0, sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                sum += nums[i];
            } else {
                max = Math.max(sum, max);
                sum = nums[i];
            }
        }
        max = Math.max(sum, max);
        return max;
    }
}
