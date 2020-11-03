package com.algorithm.array;

import javax.swing.text.StyledEditorKit;
import java.lang.reflect.Array;
import java.util.*;

/***
 * @Description: 寻找相同的字符
 * @level easy
 * @author wtychn
 * @Date 2020/10/14
 */
public class LC_1002_CommonChars {
    public List<String> commonChars(String[] A) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for (String s : A) {
            int[] freq = new int[26];
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < freq.length; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < minFreq.length; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                res.add(String.valueOf((char) ('a' + i)));
            }
        }
        return res;
    }
}
