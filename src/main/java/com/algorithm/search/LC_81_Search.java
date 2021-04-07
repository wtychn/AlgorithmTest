package com.algorithm.search;
/***
 * @Description: 搜索旋转排序数组2  
 * @level mid 
 * @author wtychn
 * @Date 2021/4/7
 */
public class LC_81_Search {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) return true;
            if (nums[l] == nums[m]) {
                l++;
                continue;
            }
            if (nums[l] < nums[m]) {
                if (nums[m] > target && nums[l] <= target) r = m - 1;
                else l = m + 1;
            } else {
                if (nums[m] < target && nums[r] >= target) l = m + 1;
                else r = m - 1;
            }
        }
        return false;
    }
}
