package com.algorithm.string;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 同构字符串  
 * @level easy 
 * @author wtychn
 * @Date 2020/12/29
 */
public class LC_205_IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if ((s2t.containsKey(s.charAt(i)) && s2t.get(s.charAt(i)) != t.charAt(i))
                ||(t2s.containsKey(t.charAt(i)) && t2s.get(t.charAt(i)) != s.charAt(i))) {
                return false;
            }
            s2t.put(s.charAt(i), t.charAt(i));
            t2s.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }

}
