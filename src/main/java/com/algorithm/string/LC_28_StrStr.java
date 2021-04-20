package com.algorithm.string;
/***
 * @Description: 实现字符串匹配（有时间使用 KMP 实现）
 * @level easy
 * @author wtychn
 * @Date 2021/4/20
 */
public class LC_28_StrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int h = i, n = 0;
            while (h < haystack.length() && n < needle.length()) {
                if(haystack.charAt(h) != needle.charAt(n)) break;
                h++;
                n++;
            }
            if(n == needle.length()) return i;
        }
        return -1;
    }
}
