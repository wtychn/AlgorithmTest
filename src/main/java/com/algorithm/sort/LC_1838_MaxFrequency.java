package com.algorithm.sort;

import java.util.Arrays;
/***
 * @Description: 最高频元素的频数
 * @level mid
 * @author wtychn
 * @Date 2021/7/21
 */
public class LC_1838_MaxFrequency {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0, sum = 0;
        int res = 1;
        for (int r = 1; r < n; r++) {
            sum += (nums[r] - nums[r - 1]) * (r - l);
            while (sum > k) {
                sum -= nums[r] - nums[l];
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
