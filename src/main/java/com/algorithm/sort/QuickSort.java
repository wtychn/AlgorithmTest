package com.algorithm.sort;

import java.util.Arrays;

public class QuickSort {
//    public static void main(final String[] args) {
//        final int[] arr = { 53, 3, 42, 14, 748, 214 };
//        try {
//            System.out.println(Arrays.toString(sort(arr)));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public int[] sort(final int[] sourceArray) {
        // 对 arr 进行拷贝，不改变参数内容
        final int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        quickSort(arr, 0, arr.length - 1);

        return arr;
    }

    private void quickSort(final int[] arr, final int left, final int right) {
        if (left < right) {
            final int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
    }

    private int partition(final int[] arr, final int left, final int right) {
        // 设定基准值（pivot）
        int index = left + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[left]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, left, index - 1);
        return index - 1;
    }

    private void swap(final int[] arr, final int i, final int j) {
        final int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
    }
}