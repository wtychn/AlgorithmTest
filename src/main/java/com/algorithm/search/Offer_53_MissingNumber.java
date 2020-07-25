package com.algorithm.search;

/**
 * @program: AlgorithmTest
 * @description: offer53
 * @author: Mr.Wang
 * @create: 2020-07-24 19:42
 **/
public class Offer_53_MissingNumber {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if(mid == nums[mid]) left = mid + 1;
            else right = mid + 1;
        }
        return left + 1;
    }
}
