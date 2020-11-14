package com.algorithm.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/***
 * @Description: 计算字符串到最优需要去掉几个字母
 * @level mid
 * @author wtychn
 * @Date 2020/11/8
 */
public class LC_5562_MinDeletions {
    public int minDeletions(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        char[] characters = s.toCharArray();
        for (char c : characters) {
            if(!freq.containsKey(c)) freq.put(c, 1);
            else freq.put(c, freq.get(c) + 1);
        }

        Set<Integer> count = new HashSet<>();
        int res = 0;
        for (Integer value : freq.values()) {
            while (count.contains(value)) {
                value--;
                res++;
            }
            if(value != 0) count.add(value);
        }
        return res;
    }
}
