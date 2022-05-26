package com.algorithm.bit;

import java.util.HashMap;
import java.util.Map;

/***
 * @Description: 最大单词长度乘积
 * @level mid
 * @author wtychn
 * @Date 2021/11/17
 */
public class LC_318_MaxProduct {
    public int maxProduct(String[] words) {
        Map<Integer, Integer> lengthMap = new HashMap<>();
        for (String word : words) {
            // 用数字最低的 26 位来判断该位置是否有对应字母出现
            int mask = 0;
            for (int i = 0; i < word.length(); i++) {
                mask |= 1 << (word.charAt(i) - 'a');
            }
            lengthMap.put(mask, Math.max(word.length(), lengthMap.getOrDefault(mask, 0)));
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry1 : lengthMap.entrySet()) {
            for (Map.Entry<Integer, Integer> entry2 : lengthMap.entrySet()) {
                if ((entry1.getKey() & entry2.getKey()) == 0) {
                    max = Math.max(entry1.getValue() * entry2.getValue(), max);
                }
            }
        }
        return max;
    }
}
