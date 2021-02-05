package com.algorithm.dynamic_programming;
/***
 * @Description: 斐波那契数  
 * @level easy
 * @author wtychn
 * @Date 2021/1/4
 */
public class LC_509_Fib {
    public int fib(int n) {
        if(n < 2) return n;
        int last = 0, cur = 1, next;
        for (int i = 2; i <= n; i++) {
            next = last + cur;
            last = cur;
            cur = next;
        }
        return cur;
    }
}
