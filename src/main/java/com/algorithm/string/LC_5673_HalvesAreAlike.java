package com.algorithm.string;
/***
 * @Description: 判断字符串的两半是否相似
 * @level easy
 * @author wtychn
 * @Date 2020/12/27
 */
public class LC_5673_HalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);
        char[] chars = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int aCount = 0, bCount = 0;
        for (int i = 0; i < a.length(); i++) {
            for (char c : chars) {
                if (a.charAt(i) == c) {
                    aCount++;
                }
                if (b.charAt(i) == c) {
                    bCount++;
                }
            }
        }
        return aCount == bCount;
    }
}
