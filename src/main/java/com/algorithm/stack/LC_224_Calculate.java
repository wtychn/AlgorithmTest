package com.algorithm.stack;

import java.util.Stack;

/***
 * @Description: 简单计算器（只有加减）
 * @level hard
 * @author wtychn
 * @Date 2021/3/10
 */
public class LC_224_Calculate {
    // 只有加减就可以忽略括号，计算中根据括号前的符号进行变号
    public int calculate(String s) {
        int res = 0, i = 0, sign = 1;
        // 栈中只记录括号前的符号
        Stack<Integer> stack = new Stack<>();
        stack.push(sign);
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == ' ') {
                i++;
            } else if (c == '+') {
                sign = stack.peek();
                i++;
            } else if (c == '-') {
                sign = -stack.peek();
                i++;
            } else if (c == '(') {
                stack.push(sign);
                i++;
            } else if (c == ')') {
                stack.pop();
                i++;
            } else {
                long num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                res += sign * num;
            }
        }
        return res;
    }
}
