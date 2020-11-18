package com.algorithm.sort;

import java.util.Arrays;

public class QuickSort {
    public int[] sort(final int[] sourceArray) {
        // 对 arr 进行拷贝，不改变参数内容
        final int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        return quickSort(arr, 0, arr.length - 1);
    }

    private int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partition = partition(arr, left, right);
            quickSort(arr, left, partition - 1);
            quickSort(arr, partition + 1, right);
        }
        return arr;
    }

    //    pivot是标定点，这里选取数组中最左边的数作为标定点
    private int partition(int[] arr, int pivot, int right) {
//      index指向大于标定点的数
        int index = pivot + 1;
        for (int i = index; i < right + 1; i++) {
//      出现大于标定点的数时index停止移动；再次出现小于标定点的数时，先与index指向的第一个大于标定的数换位，然后index指向下一个数
            if (arr[i] < arr[pivot]) {
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
}