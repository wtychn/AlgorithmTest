package com.algorithm.math;
/***
 * @Description: 数组异或操作
 * @level easy
 * @author wtychn
 * @Date 2021/5/7
 */
public class LC_1486_XorOperation {
    public int xorOperation(int n, int start) {
        int res = start;
        for (int i = 1; i < n; i++) {
            res ^= start + i << 1;
        }
        return res;
    }
}
