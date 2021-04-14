package com.algorithm.stack;

import java.util.Stack;
/***
 * @Description: 按层级反转字符串
 * @level hw1
 * @author wtychn
 * @Date 2021/4/14
 */
public class HW_414_1 {
    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> buffer = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != ')') {
                stack.push(c);
            } else {
                while (stack.peek() != '(')
                    buffer.push(stack.pop());
                stack.pop();
                stack.addAll(buffer);
                buffer.clear();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
