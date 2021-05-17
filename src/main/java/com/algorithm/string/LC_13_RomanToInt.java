package com.algorithm.string;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 罗马数字转整数
 * @level easy
 * @author wtychn
 * @Date 2021/5/15
 */
public class LC_13_RomanToInt {
    Map<Character, Integer> values = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int cur = values.get(s.charAt(i));
            int next = values.get(s.charAt(i + 1));
            if(cur < next) res -= cur;
            else res += cur;
        }
        res += values.get(s.charAt(s.length() - 1));
        return res;
    }
}
