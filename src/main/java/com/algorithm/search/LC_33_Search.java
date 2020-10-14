package com.algorithm.search;

/**
 * @program: AlgorithmTest
 * @description: lc33
 * @author: Mr.Wang
 * @create: 2020-08-17 17:16
 **/
public class LC_33_Search {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int start = 0, end = nums.length - 1, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if(nums[mid] == target) return mid;
            //前半段有序
            if (nums[start] <= nums[mid]) {
                //判断target位置 在前半段
                if (target >= nums[start] && target < nums[mid]) end = mid - 1;
                //在后半段
                else start = mid + 1;
            //后半段有序
            } else {
                //判断target位置 在后半段
                if (target <= nums[end] && target > nums[mid]) start = mid + 1;
                //在前半段
                else end = mid - 1;
            }
        }
        return -1;
    }
}
