package com.algorithm.array;

import java.util.Deque;
import java.util.LinkedList;
/***
 * @Description: 移掉K位数字使剩下的数字最小
 * @level mid
 * @author wtychn
 * @Date 2020/11/16
 */
public class LC_402_RemoveKdigits {
    public String removeKdigits(String num, int k) {
        Deque<Character> resStack = new LinkedList<>();
        char[] numArray = num.toCharArray();
        for (char value : numArray) {
            while (k > 0 && !resStack.isEmpty() && value < resStack.peekLast()) {
                resStack.pollLast();
                k--;
            }
            resStack.addLast(value);
        }

        for (int i = 0; i < k; i++) {
            resStack.pollLast();
        }

        StringBuilder res = new StringBuilder();
        boolean leadingZero = true;
        while (!resStack.isEmpty()) {
            if (leadingZero && resStack.peekFirst() == '0') {
                resStack.pollFirst();
                continue;
            }
            leadingZero = false;
            res.append(resStack.pollFirst());
        }
        return res.length() == 0 ? "0" : res.toString();
    }
}
