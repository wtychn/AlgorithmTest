package com.algorithm.hash;

import java.util.*;
/***
 * @Description: 长度为3的不同回文子序列
 * @level mid
 * @author wtychn
 * @Date 2021/7/11
 */
public class LC_5809_CountPalindromicSubsequence {
    public int countPalindromicSubsequence(String s) {
        char[] chars = s.toCharArray();
        int res = 0;
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char key = chars[i];
            if (map.containsKey(key)) {
                map.get(key).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(key, list);
            }
        }
        for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
            Set<Character> set = new HashSet<>();
            List<Integer> list = entry.getValue();
            int l = list.get(0), r = list.get(list.size() - 1);
            for (int k = l; k <= r; k++) {
                set.add(chars[k]);
            }
            res += set.size();
        }
        return res;
    }
}
