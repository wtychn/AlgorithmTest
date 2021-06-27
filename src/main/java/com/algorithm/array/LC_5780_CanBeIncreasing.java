package com.algorithm.array;
/***
 * @Description: 删除一个元素使数组严格递增
 * @level easy
 * @author wtychn
 * @Date 2021/6/27
 */
public class LC_5780_CanBeIncreasing {
    public boolean canBeIncreasing(int[] nums) {
        boolean isAppeared = true;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                if (isAppeared) {
                    if (i - 1 < 0 || nums[i + 1] > nums[i - 1] ||
                        i + 2 >= n || nums[i + 2] > nums[i]) {
                        isAppeared = false;
                    } else {
                        return false;
                    }
                }
                else return false;
            }
        }
        return true;
    }
}
