package com.algorithm.hash;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 重新分配字符使所有字符串都相等
 * @level easy
 * @author wtychn
 * @Date 2021/6/13
 */
public class LC_5784_MakeEqual {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> freq = new HashMap<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if(entry.getValue() % words.length != 0) return false;
        }
        return true;
    }
}
