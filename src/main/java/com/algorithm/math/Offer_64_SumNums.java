package com.algorithm.math;

/**
 * @program: AlgorithmTest
 * @description: offer64
 * @author: Mr.Wang
 * @create: 2020-08-01 12:51
 **/
public class Offer_64_SumNums {
    public int sumNums(int n) {
        //利用逻辑判断符的短路效应
        boolean x = n > 1 && (n += sumNums(n - 1)) >= 0;
        return n;
    }
}
