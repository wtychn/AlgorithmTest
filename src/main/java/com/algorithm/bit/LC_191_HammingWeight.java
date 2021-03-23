package com.algorithm.bit;

/***
 * @Description: 位 1 的个数  
 * @level easy 
 * @author wtychn
 * @Date 2021/3/23
 */
public class LC_191_HammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= n - 1;
            count++;
        }
        return count;
    }
}
