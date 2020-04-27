package com.algorithm.array;

public class Offer_17_PrintArray {
    public int[] printNumbers(int n) {
        int max = (int) Math.pow(10, n) - 1;
        int[] res = new int[max];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
