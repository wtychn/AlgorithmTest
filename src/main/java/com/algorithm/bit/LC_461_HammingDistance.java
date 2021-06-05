package com.algorithm.bit;
/***
 * @Description: 汉明距离
 * @level easy
 * @author wtychn
 * @Date 2021/5/27
 */
public class LC_461_HammingDistance {
    public int hammingDistance(int x, int y) {
        int count = 0, s = x ^ y;
        for (int i = 0; i < 31; i++)
            count += (s >> i) & 1;
        return count;
    }
}
