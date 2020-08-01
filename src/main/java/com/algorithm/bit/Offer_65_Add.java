package com.algorithm.bit;

/**
 * @program: AlgorithmTest
 * @description: offer65
 * @author: Mr.Wang
 * @create: 2020-08-01 13:13
 **/
public class Offer_65_Add {
    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }
}
