package com.algorithm.array;

import java.util.Arrays;

public class LC_1356_SortByBits {
    public int[] sortByBits(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partition = partition(arr, left, right);
            quickSort(arr, left, partition - 1);
            quickSort(arr, partition + 1, right);
        }
    }

    private int partition(int[] arr, int pivot, int right) {
        int index = pivot + 1;
        for (int i = index; i < right + 1; i++) {
            String si = Integer.toBinaryString(arr[i]);
            String sp = Integer.toBinaryString(arr[pivot]);
            int iCount = count(si);
            int pCount = count(sp);
            if (iCount < pCount || (iCount == pCount && arr[i] < arr[pivot])) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, index - 1, pivot);
        return index - 1;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private int count(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i) == '1' ? c + 1 : c;
        }
        return c;
    }

    public int[] sortByBits_weighted(int[] arr) {
        // 给二进制中 1 的个数加权
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.bitCount(arr[i]) * 10000 + arr[i];
        }
        Arrays.sort(arr);
        // 数组还原
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10000;
        }
        return arr;
    }
}
