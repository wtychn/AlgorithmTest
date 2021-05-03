package com.algorithm.math;
/***
 * @Description: 整数反转
 * @level easy
 * @author wtychn
 * @Date 2021/5/3
 */
public class LC_7_Reverse {
    public int reverse(int x) {
        int cur = 0;
        while (x != 0) {
            int pop = x % 10;
            if((cur > Integer.MAX_VALUE / 10 || (cur == Integer.MAX_VALUE / 10 && pop > 7)) ||
               (cur < Integer.MIN_VALUE / 10 || (cur == Integer.MIN_VALUE / 10 && pop < -8)))
                return 0;
            cur = cur * 10 + pop;
            x /= 10;
        }
        return cur;
    }
}
