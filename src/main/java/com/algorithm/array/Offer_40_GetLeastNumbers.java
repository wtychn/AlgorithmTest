package com.algorithm.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Offer_40_GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1, k - 1);
        return Arrays.copyOf(arr, k);
    }

    private void quickSort(int[] arr, int left, int right,int k) {
        if (left < right) {
            int partition = partition(arr, left, right);
            if (partition > k) quickSort(arr, left, partition - 1, k);
            else if (partition < k) quickSort(arr, partition + 1, right, k);
        }
    }

//    pivot是标定点，这里选取数组中最左边的数作为标定点
    private int partition(int[] arr, int pivot, int right) {
        int index = pivot + 1;
        for (int i = index; i < right + 1; i++) {
//      出现大于标定点的数时index停止移动；再次出现小于标定点的数时，先与index指向的第一个大于标定的数换位，然后index指向下一个数
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
//        最后将标定点换到中间
        swap(arr, index - 1, pivot);
//        返回分割点（标定点位置）
        return index - 1;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
