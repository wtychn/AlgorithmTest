package com.algorithm.search;

/**
 * @program: AlgorithmTest
 * @description: lc34
 * @author: Mr.Wang
 * @create: 2020-08-20 17:24
 **/
public class LC_34_SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int index = binarySearch(nums, 0, nums.length - 1, target);
        int[] result = new int[]{-1, -1};
        if (index != -1) {
            int i = index, j = index, temp = 0;
            while (i >= 0 && temp > -1) {
                temp = binarySearch(nums, 0, i - 1, target);
                if(temp != -1) i = temp;
            }
            temp = 0;
            while (j < nums.length && temp > -1) {
                temp = binarySearch(nums, j + 1, nums.length - 1, target);
                if(temp != -1) j = temp;
            }
            result[0] = i;
            result[1] = j;
        }
        return result;
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) return binarySearch(nums, left, mid - 1, target);
            if (nums[mid] < target) return binarySearch(nums, mid + 1, right, target);
            if (nums[mid] == target) return mid;
        }
        return -1;
    }
}
