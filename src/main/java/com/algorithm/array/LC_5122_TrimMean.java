package com.algorithm.array;

import java.util.Arrays;
import java.util.Collections;

public class LC_5122_TrimMean {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int count = arr.length / 20;
        int[] arr2 = Arrays.copyOfRange(arr, count, arr.length - count);
        int sum = 0;
        for (int n : arr2) {
            sum += n;
        }
        return (double) sum / arr2.length;
    }
}
