package com.algorithm.array;

/**
 * @program: AlgorithmTest
 * @description: offer59
 * @author: Mr.Wang
 * @create: 2020-07-27 19:46
 **/
public class Offer_59_MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < res.length; i++) {
            int max = nums[i];
            for (int j = i; j < i + k; j++) {
                max = Math.max(nums[j], max);
            }
            res[i] = max;
        }
        return res;
    }
}
