package com.algorithm.string;

import java.util.HashMap;

public class Offer_48_LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int l = -1, res = 0;
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> charsMap = new HashMap<>();
        for (int r = 0; r < chars.length; r++) {
            if (charsMap.containsKey(chars[r])) {
                // 精髓，取左边界的最大值，舍弃之前遍历的部分
                l = Math.max(l, charsMap.get(chars[r]));
            }
            res = Math.max(res, r - l);
            charsMap.put(chars[r], r);
        }
        return res;
    }
}
