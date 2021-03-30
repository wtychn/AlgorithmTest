package com.algorithm.bit;
/***
 * @Description: 颠倒二进制位
 * @level easy
 * @author wtychn
 * @Date 2021/3/30
 */
public class LC_190_ReverseBits {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
}
