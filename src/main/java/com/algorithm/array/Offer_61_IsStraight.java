package com.algorithm.array;

/**
 * @program: AlgorithmTest
 * @description: offer61
 * @author: Mr.Wang
 * @create: 2020-07-31 11:24
 **/
public class Offer_61_IsStraight {
    public boolean isStraight(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        int joker = 0;
        for (int i = 0; i < 4; i++) {
            if(nums[i] == 0) joker++;
            else if(nums[i] == nums[i + 1]) return false;
        }
        //精髓在于最大减最小小于5即可满足顺子条件
        return nums[4] - nums[joker] < 5;
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int pivot = partition(nums, left, right);
            quickSort(nums, pivot + 1, right);
            quickSort(nums, left, pivot - 1);
        }
    }

    private int partition(int[] nums, int left, int right) {
        if(left >= right) return left;
        int index = left + 1;
        for (int i = index; i <= right; i++) {
            if (nums[i] < nums[left]) {
                swap(nums, i, index);
                index++;
            }
        }
        swap(nums, index - 1, left);
        return index - 1;
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
