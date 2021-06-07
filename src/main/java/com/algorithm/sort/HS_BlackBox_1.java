package com.algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;
/***
 * @Description: bit排序
 * @level mid
 * @author wtychn
 * @Date 2021/6/7
 */
public class HS_BlackBox_1 {
    int m;

    public int[] solution(int n, int m, int[] nums) {
        this.m = m;
        return Arrays.copyOf(quickSort(nums, 0, nums.length - 1), m);
    }

    private int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partition = partition(arr, left, right);
            if (partition < m) {
                quickSort(arr, partition + 1, right);
            }
            quickSort(arr, left, partition - 1);
        }
        return arr;
    }

    private int partition(int[] arr, int pivot, int right) {
        int index = pivot + 1;
        for (int i = index; i < right + 1; i++) {
            if (Integer.bitCount(arr[i]) > Integer.bitCount(arr[pivot]) ||
               (Integer.bitCount(arr[i]) == Integer.bitCount(arr[pivot]) && arr[i] > arr[pivot])) {
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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        HS_BlackBox_1 main = new HS_BlackBox_1();
        System.out.println(Arrays.toString(main.solution(n, m, nums)));
    }
}
