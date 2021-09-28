package com.algorithm.string;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/***
 * @Description: 按单词反转字符串
 * @level mid
 * @author wtychn
 * @Date 2021/9/29
 */
public class Offer_58_ReverseWords {
    public String reverseWords(String s) {
        String[] strings = s.trim().split(" ");
        Stack<String> stringStack = new Stack<>();
        for (String str : strings) {
            if (!str.equals("")) stringStack.add(str);
        }
        StringBuilder res = new StringBuilder();
        while (!stringStack.isEmpty()) {
            res.append(stringStack.pop());
            res.append(" ");
        }
        return res.toString().trim();
    }

    public String reverseWords_doublePointers(String s) {
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') i--;
            res.append(s, i + 1, j + 1).append(" ");
            while (i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        return res.toString().trim();
    }
}
