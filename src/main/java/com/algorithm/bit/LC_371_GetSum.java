package com.algorithm.bit;
/***
 * @Description: 两整数之和
 * @level mid
 * @author wtychn
 * @Date 2021/9/26
 */
public class LC_371_GetSum {
    public int getSum(int a, int b) {
        while (b != 0) {
            // 进位结果
            int carry = (a & b) << 1;
            // 不进位加法结果
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
