package com.algorithm.math;
/***
 * @Description: 统计所有小于非负整数 n 的质数的数量(埃氏筛)
 * @level easy
 * @author wtychn
 * @Date 2020/12/3
 */
public class LC_204_CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] isComposite = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isComposite[j] = true;
                    }
                }
            }
        }
        return count;
    }
}
