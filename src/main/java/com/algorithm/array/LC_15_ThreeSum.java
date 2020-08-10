package com.algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: AlgorithmTest
 * @description: lc15
 * @author: Mr.Wang
 * @create: 2020-08-10 12:47
 **/
public class LC_15_ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    while (j < k && nums[j] == nums[++j]);
                } else if (sum > 0) {
                    while (j < k && nums[k] == nums[--k]);
                } else {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k])));
                    while (j < k && nums[j] == nums[++j]);
                    while (j < k && nums[k] == nums[--k]);
                }
            }
        }
        return res;
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int pivot = partition(nums, left, right);
            quickSort(nums, pivot + 1, right);
            quickSort(nums, left, pivot - 1);
        }
    }

    private int partition(int[] nums, int left, int right) {
        int index = left + 1;
        for (int i = index; i <= right; i++) {
            if (nums[i] < nums[left]) {
                swap(nums, i, index);
                index++;
            }
        }
        swap(nums, left, index - 1);
        return index - 1;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
