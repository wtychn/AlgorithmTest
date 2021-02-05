package com.algorithm.string;
/***
 * @Description: 尽可能使字符串相等  
 * @level mid 
 * @author wtychn
 * @Date 2021/2/5
 */
public class LC_1208_EqualSubstring {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0, cost = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            cost += Math.abs(s.charAt(i) - t.charAt(i));
            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
