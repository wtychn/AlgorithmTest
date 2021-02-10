package com.algorithm.array;

/***
 * @Description: 字符串的排列  
 * @level mid 
 * @author wtychn
 * @Date 2021/2/10
 */
public class LC_567_CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            int rightIndex = s2.charAt(right) - 'a';
            freq[rightIndex]--;
            while (freq[rightIndex] < 0) {
                freq[s2.charAt(left) - 'a']++;
                left++;
            }
            if (right - left + 1 == s1.length()) {
                return true;
            }
        }
        return false;
    }
}
