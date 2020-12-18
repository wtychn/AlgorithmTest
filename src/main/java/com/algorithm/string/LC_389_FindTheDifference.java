package com.algorithm.string;
/***
 * @Description: 找不同  
 * @level easy 
 * @author wtychn
 * @Date 2020/12/18
 */
public class LC_389_FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
            if(freq[c - 'a'] < 0) return c;
        }
        return ' ';
    }

    public char findTheDifference_xor(String s, String t) {
        char res = 0;
        for (char c : s.toCharArray()) {
            res ^= c;
        }
        for (char c : t.toCharArray()) {
            res ^= c;
        }
        return res;
    }
}
