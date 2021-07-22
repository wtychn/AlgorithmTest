package com.algorithm.string;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 字符输入处理
 * @level mid
 * @author wtychn
 * @Date 2021/7/19
 */
public class HW_interview_719 {
    Map<Character, String> map;

    public String solution(String s) {
        map = new HashMap<>();
        map.put('1', ",.");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        map.put('0', " ");

        String[] input = s.split("#");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
                res.append(input[i]);
            } else {
                res.append(charInput(input[i]));
            }
        }
        return res.toString();
    }

    private String charInput(String input) {
        input += '*';
        char[] chars = input.toCharArray();
        int i = 1;
        StringBuilder cur = new StringBuilder("" + chars[0]);
        StringBuilder res = new StringBuilder();
        while (i < input.length()) {
            if (chars[i] != chars[i - 1]) {
                if (chars[i - 1] <= '9' && chars[i - 1] >= '1') {
                    String value = map.get(chars[i - 1]);
                    char c = value.charAt((cur.length() - 1) % value.length());
                    res.append(c);
                } else if (chars[i - 1] == '0') {
                    for (int j = 0; j < cur.length(); j++) {
                        res.append(" ");
                    }
                }
                cur = new StringBuilder();
                cur.append(chars[i]);
            } else {
                cur.append(chars[i]);
            }
            i++;
        }
        return res.toString();
    }
}
