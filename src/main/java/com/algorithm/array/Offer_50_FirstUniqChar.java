package com.algorithm.array;

import java.util.HashMap;
import java.util.Map;

public class Offer_50_FirstUniqChar {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Boolean> characterMap = new HashMap<>();
        for (char aChar : chars) {
            characterMap.put(aChar, !characterMap.containsKey(aChar));
        }
        for (char aChar : chars) {
            if (characterMap.get(aChar)) return aChar;
        }
        return ' ';
    }
}
