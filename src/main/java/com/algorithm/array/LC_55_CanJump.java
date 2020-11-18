package com.algorithm.array;

/**
 * @program: AlgorithmTest
 * @description: lc55
 * @author: Mr.Wang
 * @create: 2020-09-03 11:43
 **/
public class LC_55_CanJump {
    public boolean canJump(int[] nums) {
        int rightMost = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= rightMost) {
                rightMost = Math.max(rightMost, i + nums[i]);
                if (rightMost >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
