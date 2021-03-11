package com.algorithm.stack;

import java.util.Stack;
/***
 * @Description: 基本计算器2
 * @level mid
 * @author wtychn
 * @Date 2021/3/11
 */
public class LC_227_Caculateii {
    // 先算乘除再算加减
    public int calculate(String s) {
        Stack<Long> nums = new Stack<>();
        Stack<Character> signs = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c <= '9' && c >= '0') {
                long tem = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    tem = tem * 10 + s.charAt(i) - '0';
                    i++;
                }
                if (!signs.isEmpty() && signs.peek().equals('*')) {
                    nums.push(nums.pop() * tem);
                    signs.pop();
                } else if (!signs.isEmpty() && signs.peek().equals('/')) {
                    nums.push(nums.pop() / tem);
                    signs.pop();
                } else {
                    nums.push(tem);
                }
            } else if (c == ' ') {
                i++;
            } else {
                signs.push(c);
                i++;
            }
        }
        long res = 0;
        while (!signs.isEmpty()) {
            if (signs.pop().equals('+')) {
                res += nums.pop();
            } else {
                res -= nums.pop();
            }
        }
        if (!nums.isEmpty()) {
            res += nums.pop();
        }
        return (int) res;
    }
}
