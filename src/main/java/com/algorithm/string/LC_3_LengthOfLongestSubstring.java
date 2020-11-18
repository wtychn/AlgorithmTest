package com.algorithm.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: AlgorithmTest
 * @description: lc3
 * @author: Mr.Wang
 * @create: 2020-08-05 11:49
 **/
public class LC_3_LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left = -1, res = 0;
        Map<Character, Integer> chars = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            if (chars.containsKey(s.charAt(r)))
                left = Math.max(left, chars.get(s.charAt(r)));
            res = Math.max(res, r - left);
            chars.put(s.charAt(r), r);
        }
        return res;
    }
}
