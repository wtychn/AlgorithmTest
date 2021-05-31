package com.algorithm.bit;
/***
 * @Description: 4的幂
 * @level easy
 * @author wtychn
 * @Date 2021/5/31
 */
public class LC_342_IsPowerOfFour {
    public boolean isPowerOfFour(int n) {
        return (n & (n - 1)) == 0 && n % 4 == 0;
    }
}
