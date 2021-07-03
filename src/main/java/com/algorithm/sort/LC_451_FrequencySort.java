package com.algorithm.sort;

import java.util.HashMap;
import java.util.Map;

/***
 * @Description: 根据字符出现频率排序
 * @level mid
 * @author wtychn
 * @Date 2021/7/3
 */
public class LC_451_FrequencySort {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        int maxFre = 0;
        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
            maxFre = Math.max(freq.get(s.charAt(i)), maxFre);
        }
        StringBuilder[] buckets = new StringBuilder[maxFre + 1];
        // 数组中每个对象都要初始化
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new StringBuilder();
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()){
            int frequency = entry.getValue();
            char c = entry.getKey();
            // 按照频率添加进 sb 数组中
            for (int i = 0; i < frequency; i++) {
                buckets[frequency].append(c);
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = maxFre; i > 0; i--) {
            res.append(buckets[i]);
        }
        return res.toString();
    }
}
