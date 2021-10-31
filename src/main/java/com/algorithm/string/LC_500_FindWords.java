package com.algorithm.string;

import java.util.ArrayList;
import java.util.List;

/***
 * @Description: 键盘行
 * @level easy
 * @author wtychn
 * @Date 2021/10/31
 */
public class LC_500_FindWords {
    public String[] findWords(String[] words) {
        String rowIdx = "12210111011122000010020202";
        List<String> res = new ArrayList<>();
        for (String word : words) {
            int i = 0;
            int lastIdx = rowIdx.charAt(Character.toLowerCase(word.charAt(i)) - 'a') - '0';
            for (i = 1; i < word.length(); i++) {
                int charIdx = rowIdx.charAt(Character.toLowerCase(word.charAt(i)) - 'a') - '0';
                if (charIdx != lastIdx) {
                    break;
                }
            }
            if (i == word.length()) {
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}
