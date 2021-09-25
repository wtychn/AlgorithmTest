package com.algorithm.search;

/***
 * @Description: 寻找峰值
 * @level mid
 * @author wtychn
 * @Date 2021/9/15
 */
public class LC_162_FindPeakElement {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            int stat = isPeek(nums, m);
            if (stat == 0) {
                return m;
            } else if (stat == 1) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    /**
     * 判断是否为峰值
     * 0: 峰值
     * 1: 上坡
     * -1: 下坡 / 山谷
     */
    private int isPeek(int[] nums, int idx) {
        if ((idx == nums.length - 1 || nums[idx] > nums[idx + 1]) &&
                (idx == 0 || nums[idx] > nums[idx - 1])) {
            return 0;
        } else if ((idx < nums.length - 1 && nums[idx] <= nums[idx + 1]) &&
                (idx == 0 || nums[idx] >= nums[idx - 1])) {
            return 1;
        } else {
            return -1;
        }
    }
}
