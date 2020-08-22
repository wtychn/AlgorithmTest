package com.algorithm.array;

public class Offer_45_MinNumber {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        quickSort(strs, 0, strs.length - 1);
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    private void quickSort(String[] strs, int left, int right) {
        if (left < right) {
            int partition = partition(strs, left, right);
            quickSort(strs, partition + 1, right);
            quickSort(strs, left, partition - 1);
        }
    }

    private int partition(String[] strs, int pivot, int right) {
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            //字符串 x+y > y+x 则 x > y
            if ((strs[i] + strs[pivot]).compareTo(strs[pivot] + strs[i]) < 0) {
                swap(strs, i, index - 1);
                index++;
            }
        }
        swap(strs, index, pivot);
        return index - 1;
    }

    private void swap(String[] strs, int a, int b) {
        String temp = strs[a];
        strs[a] = strs[b];
        strs[b] = temp;
    }
}
