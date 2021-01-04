package com.algorithm.dynamic_programming;
/***
 * @Description: 斐波那契数  
 * @level easy 
 * @author wtychn
 * @Date 2021/1/4
 */
public class LC_509_Fib {
    public int fib(int n) {
        int last = 0, cur = 1, next;
        if(n == 0) return last;
        if(n == 1) return cur;
        for (int i = 2; i <= n; i++) {
            next = last + cur;
            last = cur;
            cur = next;
        }
        return cur;
    }
}
