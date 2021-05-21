package com.algorithm.hash;

import java.util.*;
/***
 * @Description: 前K个高频单词
 * @level mid
 * @author wtychn
 * @Date 2021/5/20
 */
public class LC_692_TopKFrequent {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        Queue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (o1, o2) ->
                 o1.getValue().equals(o2.getValue()) ? o2.getKey().compareTo(o1.getKey()) : o1.getValue() - o2.getValue()
        );
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll().getKey());
        }
        Collections.reverse(res);
        return res;
    }
}
