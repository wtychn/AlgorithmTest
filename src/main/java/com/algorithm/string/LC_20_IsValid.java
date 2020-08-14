package com.algorithm.string;

import java.util.Stack;

/**
 * @program: AlgorithmTest
 * @description: lc20
 * @author: Mr.Wang
 * @create: 2020-08-14 09:25
 **/
public class LC_20_IsValid {
    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!characters.isEmpty()
                    && ((c == ')' && characters.peek() == '(') ||
                    (c == ']' && characters.peek() == '[') ||
                    (c == '}' && characters.peek() == '{'))) {
                characters.pop();
            } else if (c == '(' || c == '[' || c == '{') {
                characters.push(s.charAt(i));
            } else {
                return false;
            }
        }
        return characters.isEmpty();
    }
}
