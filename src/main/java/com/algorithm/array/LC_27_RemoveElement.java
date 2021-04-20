package com.algorithm.array;
/***
 * @Description: 移除元素
 * @level easy
 * @author wtychn
 * @Date 2021/4/20
 */
public class LC_27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int l = 0, r = 0;
        while (r < nums.length) {
            if (nums[r] != val) {
                l++;
                r++;
            } else {
                while (r < nums.length && nums[r] == val) {
                    r++;
                }
            }
            if(r < nums.length) nums[l] = nums[r];
        }
        return l;
    }
}
