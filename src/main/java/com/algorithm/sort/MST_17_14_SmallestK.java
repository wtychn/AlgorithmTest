package com.algorithm.sort;

import java.util.Arrays;
/***
 * @Description: 最小的 k 个数
 * @level mid
 * @author wtychn
 * @Date 2021/9/3
 */
public class MST_17_14_SmallestK {
    public int[] smallestK(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1, k);
        return Arrays.copyOf(arr, k);
    }

    private void quickSort(int[] arr, int l, int r, int k) {
        if (l < r) {
            int pivot = partition(arr, l, r);
            if (pivot < k - 1) {
                quickSort(arr, pivot + 1, r, k);
            } else if (pivot > k - 1) {
                quickSort(arr, l, pivot - 1, k);
            }
        }
    }

    private int partition(int[] arr, int l, int r) {
        int pivot = l;
        int idx = l + 1;
        for (int i = idx; i <= r; i++) {
            if (arr[i] <= arr[pivot]) {
                swap(arr, i, idx);
                idx++;
            }
        }
        swap(arr, pivot, idx - 1);
        pivot = idx - 1;
        return pivot;
    }

    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
