package com.algorithm.string;

import java.util.Stack;

public class LC_5634_MaximumGain {
    public int maximumGain(String s, int x, int y) {
        char[] chars = s.toCharArray();
        if (y > x) {
            return gain(chars, 'b', 'a', y, x);
        } else {
            return gain(chars, 'a', 'b', x, y);
        }
    }

    //根据分数优先级进行两次遍历
    private int gain(char[] chars, char b, char a, int large, int small) {
        int res = 0;
        Stack<Character> characterStack = new Stack<>(); //存放第一次遍历后的字符串
        Stack<Character> tempStack = new Stack<>();
        for (char c : chars) {
            if (!characterStack.isEmpty() &&
                    c == a && characterStack.peek() == b) {
                res += large;
                characterStack.pop();
            } else {
                characterStack.add(c);
            }
        }
        while (!characterStack.isEmpty()) {
            char cPop = characterStack.pop();
            if (!tempStack.isEmpty() &&
                    cPop == a && tempStack.peek() == b) {
                res += small;
                tempStack.pop();
            } else {
                tempStack.add(cPop);
            }
        }
        return res;
    }
}
