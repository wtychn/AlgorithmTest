package com.algorithm.string;

/**
 * @program: AlgorithmTest
 * @description: lc647
 * @author: Mr.Wang
 * @create: 2020-08-20 16:37
 **/
public class LC_647_CountSubstrings {
    int count;
    public int countSubstrings(String s) {
        count = 0;
        for (int k = 0; k < s.length(); k++) {
            centerSpread(s, k, k);
            centerSpread(s, k, k + 1);
        }
        return count;
    }

    private void centerSpread(String s, int left, int right) {
        int length = s.length();
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            } else {
                break;
            }
        }
    }
}
