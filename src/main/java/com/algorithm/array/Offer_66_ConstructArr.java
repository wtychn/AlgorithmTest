package com.algorithm.array;

/**
 * @program: AlgorithmTest
 * @description: offer66
 * @author: Mr.Wang
 * @create: 2020-08-01 13:21
 **/
public class Offer_66_ConstructArr {
    public int[] contractArr(int[] a) {
        if(a == null || a.length == 0) return new int[0];
        int[] res = new int[a.length];
        res[0] = 1;
        int tmp = 1;
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i - 1] * a[i - 1];
        }
        for (int i = a.length - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            res[i] *= tmp;
        }
        return res;
    }
}
