package com.algorithm.array;

import java.util.*;

/**
 * @program: AlgorithmTest
 * @description: lc49
 * @author: Mr.Wang
 * @create: 2020-09-03 11:13
 **/
public class LC_49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        Map<String, List> ans = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
