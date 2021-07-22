package com.algorithm.sort;

import java.util.Arrays;

/***
 * @Description: 数组中最大数对和的最小值
 * @level mid
 * @author wtychn
 * @Date 2021/7/21
 */
public class LC_1877_MinPairSum {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            res = Math.max(res, nums[i] + nums[nums.length - 1 - i]);
        }
        return res;
    }
}
