package com.algorithm.dynamic_programming;
/***
 * @Description: 最长回文子串
 * @level mid
 * @author wtychn
 * @Date 2021/4/16
 */
public class LC_5_LongestPalindrome {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        boolean[] P = new boolean[n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= i; j--) {
                P[j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || P[j - 1]);
                if (P[j] && j - i + 1 > res.length()) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
