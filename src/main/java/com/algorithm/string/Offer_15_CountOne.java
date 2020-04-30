package com.algorithm.string;

public class Offer_15_CountOne {
    public int hammingWeightByViolence(int n) {
        char[] binaryArr = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for (char c : binaryArr) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    public int hammingWeightByBitOperation(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }

    public int hammingWeightBest(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
