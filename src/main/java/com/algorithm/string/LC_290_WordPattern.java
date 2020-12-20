package com.algorithm.string;

import java.util.HashSet;
import java.util.Set;
/***
 * @Description: 单词规律  
 * @level easy 
 * @author wtychn
 * @Date 2020/12/16
 */
public class LC_290_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] bucket = new String[26];
        String[] strings = s.split(" ");
        Set<String> stringSet = new HashSet<>();
        if(pattern.length() != strings.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            int index = pattern.charAt(i) - 'a';
            if (bucket[index] == null) {
                bucket[index] = strings[i];
                if (stringSet.contains(strings[i])) return false;
                else stringSet.add(strings[i]);
            } else if (!bucket[index].equals(strings[i])) {
                return false;
            }
        }
        return true;
    }
}
