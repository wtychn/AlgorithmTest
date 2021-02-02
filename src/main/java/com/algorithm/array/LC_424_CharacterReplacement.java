package com.algorithm.array;
/***
 * @Description: 替换后的最长重复字符  
 * @level mid 
 * @author wtychn
 * @Date 2021/2/2
 */
public class LC_424_CharacterReplacement {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, max = 0;
        int[] freq = new int[26];
        while (right < s.length()) {
            freq[s.charAt(right) - 'A']++;
            max = Math.max(max, freq[s.charAt(right) - 'A']);
            if (right - left + 1 - max > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return left - right;
    }
}
