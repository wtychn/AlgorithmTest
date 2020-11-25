package com.algorithm.string;
/***
 * @Description: 上升下降字符串
 * @level easy
 * @author wtychn
 * @Date 2020/11/25
 */
public class LC_1370_SortString {
    public String sortString(String s) {
        char[] chars = s.toCharArray();
        char[] res = new char[s.length()];
        int[] freq = new int[26];
        for (char c : chars) {
            freq[c - 'a']++;
        }
        int resIndex = 0;
        while (resIndex < res.length){
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    res[resIndex++] = (char) (i + 'a');
                    freq[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    res[resIndex++] = (char) (i + 'a');
                    freq[i]--;
                }
            }
        }
        return String.valueOf(res);
    }
}
