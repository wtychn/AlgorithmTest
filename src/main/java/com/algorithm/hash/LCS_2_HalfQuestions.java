package com.algorithm.hash;

import java.util.*;
/***
 * @Description: 完成一半的题目
 * @level easy
 * @author wtychn
 * @Date 2021/6/19
 */
public class LCS_2_HalfQuestions {
    public int halfQuestions(int[] questions) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int question : questions) {
            freq.put(question, freq.getOrDefault(question, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(freq.values());
        list.sort(Comparator.reverseOrder());
        int res = 0, count = 0;
        for (Integer val : list) {
            res++;
            count += val;
            if(count >= questions.length / 2) break;
        }
        return res;
    }
}
