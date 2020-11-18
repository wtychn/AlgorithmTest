package com.algorithm.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Offer_38_Permutation {
    List<String> res = new LinkedList<>();
    char[] chars;
    public String[] permutation(String s) {
        chars = s.toCharArray();
        dfs(0);
        return res.toArray(new String[0]);
    }

    private void dfs(int cur) {
        if (cur == chars.length - 1) {
            res.add(String.valueOf(chars));
            return;
        }
        HashSet<Character> set = new HashSet<>();
//        cur所在位的数字处在所有i位置的情况
        for (int i = cur; i < chars.length - 1; i++) {
            if (set.contains(chars[i])) {
                continue;
            }
            set.add(chars[i]);
            swap(i, cur);
            dfs(cur + 1);
//            加入回溯
            swap(i, cur);
        }
    }

    private void swap(int a, int b) {
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }
}
