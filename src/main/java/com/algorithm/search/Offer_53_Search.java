package com.algorithm.search;

/**
 * @program: AlgorithmTest
 * @description: offer53
 * @author: Mr.Wang
 * @create: 2020-07-23 09:43
 **/
public class Offer_53_Search {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target) - binarySearch(nums, target - 1);
    }

    //找右边界
    private int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if(target >= nums[mid]) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}
