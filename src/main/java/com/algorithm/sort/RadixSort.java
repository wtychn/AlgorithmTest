package com.algorithm.sort;

import java.util.Arrays;

public class RadixSort {
    //基数排序
    public int[] sortArray(int[] nums) {
        int[] arr= Arrays.copyOf(nums,nums.length);
        radixSort(arr);
        return arr;
    }

    private void radixSort(int[] arr){
        int max=arr[0];
        for(int num:arr){
            max= Math.max(Math.abs(num), max);
        }
        int maxLength = Integer.toString(max).length();

        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            int[][] bucket = new int[20][0];
            int[] count = new int[20];

            for (int val : arr) {
                int usefulNum = val > 0 ? (val / n % 10 + 10) : (val / n % 10 + 9);
                bucket[usefulNum] = arrAppend(bucket[usefulNum], val);
                count[usefulNum]++;
            }

            int index = 0;
            for (int k = 0; k < count.length; k++) {
                if (count[k] != 0) {
                    for (int j = 0; j < count[k]; j++) {
                        arr[index++] = bucket[k][j];
                    }
                }
            }
        }
    }

    private int[] arrAppend(int[] nums, int value) {
        int[] arr = Arrays.copyOf(nums, nums.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }
}