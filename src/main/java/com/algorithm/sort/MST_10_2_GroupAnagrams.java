package com.algorithm.sort;

import java.util.*;
/***
 * @Description: 变位词组
 * @level mid
 * @author wtychn
 * @Date 2021/7/18
 */
public class MST_10_2_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] freq = new int[26];
            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < freq.length; i++) {
                for (int j = 0; j < freq[i]; j++) {
                    char c = (char) ('a' + i);
                    sb.append(c);
                }
            }
            String key = sb.toString();
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
