package com.algorithm.string;

import java.util.*;

/**
 * @program: AlgorithmTest
 * @description: lc15
 * @author: Mr.Wang
 * @create: 2020-08-12 10:09
 **/
public class LC_17_LetterCombinations {
    char[] res;
    List<String> resList = new ArrayList<>();
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return resList;
        res = new char[digits.length()];
        recur(digits, 0);
        return resList;
    }

    private void recur(String digits, int index) {
        if (index >= digits.length()) {
            StringBuilder sb = new StringBuilder();
            for(char c : res) sb.append(c);
            resList.add(sb.toString());
        } else {
            String nums = phone.get(digits.substring(index, index + 1));
            for (int i = 0; i < nums.length(); i++) {
                res[index] = nums.charAt(i);
                recur(digits, index + 1);
            }
        }
    }
}
