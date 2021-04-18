package com.algorithm.array;
/***
 * @Description: 删除有序数组中的重复项
 * @level easy
 * @author wtychn
 * @Date 2021/4/18
 */
public class LC_26_RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
