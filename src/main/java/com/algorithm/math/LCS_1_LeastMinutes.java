package com.algorithm.math;
/***
 * @Description: 下载插件
 * @level easy
 * @author wtychn
 * @Date 2021/6/19
 */
public class LCS_1_LeastMinutes {
    public int leastMinutes(int n) {
        int k = 1, res = 1;
        while (k < n) {
            k = k << 1;
            res++;
        }
        return res;
    }
}
