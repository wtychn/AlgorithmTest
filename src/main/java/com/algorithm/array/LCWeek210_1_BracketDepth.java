package com.algorithm.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LCWeek210_1_BracketDepth {
    public int maxDepth(String s) {
        if(s == null || s.equals("")) return 0;
        int max = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }
            if (s.charAt(i) == ')') {
                max = Math.max(max, count);
                count--;
            }
        }
        return max;
    }
}
