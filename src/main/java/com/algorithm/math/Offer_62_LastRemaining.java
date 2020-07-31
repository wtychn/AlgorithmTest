package com.algorithm.math;

/**
 * @program: AlgorithmTest
 * @description: offer62
 * @author: Mr.Wang
 * @create: 2020-07-31 15:33
 **/
public class Offer_62_LastRemaining {
    public int lastRemaining(int n, int m) {
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (res + m) % i;
        }
        return res;
    }
}
