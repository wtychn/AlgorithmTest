package com.algorithm.string;

/**
 * @program: AlgorithmTest
 * @description: lc459
 * @author: Mr.Wang
 * @create: 2020-08-24 18:48
 **/
public class LC_459_RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int i = 0, j = 0;
        if(s == null || s.length() == 0) return true;
        while (j < s.length() - 1 && s.charAt(i) != s.charAt(j)) {
            j++;
        }
        if(s.charAt(i) != s.charAt(j)) return false;
        while (j < s.length() && s.charAt(i) == s.charAt(j)) {
            i++;
            j++;
        }
        return j == s.length();
    }
}
