package com.algorithm.search;
/***
 * @Description: 寻找旋转排序数组中的最小值2  
 * @level hard 
 * @author wtychn
 * @Date 2021/4/9
 */
public class LC_154_FindMin {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[r] == nums[m]) r--;
            else if (nums[m] < nums[r]) r = m; // 考虑特殊情况 nums[m] 为最小值
            else l = m + 1;
        }
        return nums[l];
    }
}
