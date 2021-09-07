package com.algorithm.string;

/***
 * @Description: 分割平衡子串
 * @level easy
 * @author wtychn
 * @Date 2021/9/7
 */
public class LC_1221_BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int count = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur != 'L') {
                count--;
            } else {
                count++;
            }
            if (count == 0) {
                res++;
            }
        }
        return res;
    }
}
