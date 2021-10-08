package com.algorithm.hash;

import java.util.*;

/***
 * @Description: 重复的 DNA 序列
 * @level mid
 * @author wtychn
 * @Date 2021/10/8
 */
public class LC_187_FindRepeatedDnaSequences {
    static final int L = 10;
    Map<Character, Integer> bin = new HashMap<Character, Integer>() {{
        put('A', 0);    // 00
        put('C', 1);    // 01
        put('G', 2);    // 10
        put('T', 3);    // 11
    }};

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        int n = s.length();
        if (n <= L) {
            return ans;
        }
        int x = 0;
        for (int i = 0; i < L - 1; ++i) {
            x = (x << 2) | bin.get(s.charAt(i));
        }
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i <= n - L; ++i) {
            // 位运算实现滑动窗口增减字母
            x = ((x << 2) | bin.get(s.charAt(i + L - 1))) & ((1 << (L * 2)) - 1);
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
            if (cnt.get(x) == 2) {
                ans.add(s.substring(i, i + L));
            }
        }
        return ans;
    }
}
