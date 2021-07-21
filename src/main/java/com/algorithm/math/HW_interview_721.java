package com.algorithm.math;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 字符串全排列数量
 * @level mid
 * @author wtychn
 * @Date 2021/7/21
 */
public class HW_interview_721 {
    public long solution(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }
        long molecular = 1;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            molecular *= factorial(entry.getValue());
        }
        return factorial(s.length()) / molecular;
    }

    private long factorial(int i) {
        if(i == 1) return 1;
        return factorial(i - 1) * i;
    }
}
