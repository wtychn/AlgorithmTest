package com.algorithm.string;

import java.util.Stack;

/**
 * @program: AlgorithmTest
 * @description: lc5
 * @author: Mr.Wang
 * @create: 2020-08-06 10:23
 **/
public class LC_5_LongestPalindrome {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2) return s;
        
        int maxLen = 0;
        //数组第一位记录起始位置，第二位记录长度
        int[] res = new int[2];
        for (int i = 0; i < s.length() - 1; i++) {
            int[] odd = centerSpread(s, i, i);
            int[] even = centerSpread(s, i, i + 1);
            int[] max = odd[1] > even[1] ? odd : even;
            if (max[1] > maxLen) {
                res = max;
                maxLen = max[1];
            }
        }
        return s.substring(res[0], res[0] + res[1]);
    }

    private int[] centerSpread(String s, int left, int right) {
        int len = s.length();
        while (left >= 0 && right < len) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return new int[]{left + 1, right - left - 1};
    }
}
