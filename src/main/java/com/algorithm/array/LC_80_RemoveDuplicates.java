package com.algorithm.array;
/***
 * @Description: 删除有序数组中的重复项  
 * @level mid 
 * @author wtychn
 * @Date 2021/4/6
 */
public class LC_80_RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int slow = 2, fast = 2;
        while (fast < nums.length) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
