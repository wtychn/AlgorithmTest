package com.algorithm.array;
/***
 * @Description: 下一个更大的排列
 * @level mid
 * @author wtychn
 * @Date 2020/11/10
 */
public class LC_31_NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length, i = n - 2;
        // 从后往前找非递增元素 i 记录位置
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // 递增部分倒序
        for (int j = i + 1; j <= i + (n - i - 1) / 2; j++) {
            swap(nums, j, n - j + i);
        }
        //找到第一个比非递增元素大的元素，换位
        if (i >= 0) {
            int changePoint = i + 1;
            while (nums[changePoint] <= nums[i]) changePoint++;
            swap(nums, i, changePoint);
        }
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
