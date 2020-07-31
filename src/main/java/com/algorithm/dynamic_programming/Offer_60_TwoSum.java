package com.algorithm.dynamic_programming;

/**
 * @program: AlgorithmTest
 * @description: offer60
 * @author: Mr.Wang
 * @create: 2020-07-30 11:11
 **/
public class Offer_60_TwoSum {
    public double[] twoSum(int n) {
        double[] pre = {1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d};
        //动态规划从n=2开始向上推
        for (int i = 2; i <= n; i++) {
            //tmp容量为n=i时可能出现的所有情况
            double[] tmp = new double[5 * i + 1];
            //每次将上一轮数组加上一个骰子的可能性
            for (int j = 0; j < pre.length; j++) {
                for (int k = 0; k < 6; k++) {
                    tmp[j + k] += pre[j] / 6;
                }
            }
            pre = tmp;
        }
        return pre;
    }
}
