package com.algorithm.array;

public class Ali_2 {
    public int[] solution(int n, int[][] kArrays) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = i + 1;
        }
        for (int[] kArray : kArrays) {
            reverse(res, kArray[0] - 1, kArray[1] - 1);
        }
        return res;
    }

    private void reverse(int[] a, int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i++] = a[j];
            a[j--] = temp;
        }
    }
}
