package com.algorithm.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

/***
 * @Description: 最长定差子序列
 * @level mid
 * @author wtychn
 * @Date 2021/11/5
 */
public class LC_1218_LongestSubsequence {
    public int longestSubsequence(int[] arr, int difference) {
        // 预定义 map 长度能够大量节省扩容带来的时间损耗
        Map<Integer, Integer> map = new HashMap<>(arr.length);
        int max = 1;
        for (int a : arr) {
            map.put(a, map.getOrDefault(a - difference, 0) + 1);
            max = Math.max(map.get(a), max);
        }
        return max;
    }
}
