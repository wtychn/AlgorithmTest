package com.algorithm.string;

import java.util.HashSet;
import java.util.Set;
/***
 * @Description: 确定两个字符串是否接近
 * @level mid
 * @author wtychn
 * @Date 2020/11/15
 */
public class LC_5602_CloseStrings {
    public boolean closeStrings(String word1, String word2) {
        // 判断方法：1.长度相同
        if(word1.length() != word2.length()) return false;
        Set<Integer> count = new HashSet<>();
        int[] w1 = new int[26];
        int[] w2 = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            w1[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            w2[word2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < w1.length; i++) {
            // 2. 所含字符相同
            if ((w1[i] == 0 && w2[i] != 0) || (w1[i] != 0 && w2[i] == 0)) {
                return false;
            } else if(w1[i] != 0 && w2[i] != 0) {
                count.add(w1[i]);
            }
        }
        // 3. 字符数量相同（可以不是同样字符的数量）
        for (int j : w2) {
            if (j != 0 && !count.contains(j))
                return false;
        }

        return true;
    }
}
