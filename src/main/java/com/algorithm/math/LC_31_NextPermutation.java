package com.algorithm.math;

/**
 * @program: AlgorithmTest
 * @description: lc31
 * @author: Mr.Wang
 * @create: 2020-08-17 15:10
 **/
public class LC_31_NextPermutation {
    public void nextPermutation(int[] nums) {
        int index = nums.length - 2;
        while (index >= 0 && nums[index] >= nums[index + 1]) index--;
        if (index >= 0) {
            int index2 = nums.length - 1;
            while (index2 >= 0 && nums[index2] <= nums[index]) index2--;
            swap(nums, index, index2);
        }
        for (int i = index + 1, j = nums.length - 1; i < j; i++, j--)
            swap(nums, i, j);
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
