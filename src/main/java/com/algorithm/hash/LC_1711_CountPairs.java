package com.algorithm.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/***
 * @Description: 大餐计数
 * @level mid
 * @author wtychn
 * @Date 2021/7/7
 */
public class LC_1711_CountPairs {
    public int countPairs(int[] deliciousness) {
        int max = Arrays.stream(deliciousness).max().getAsInt();
        Map<Integer, Integer> map = new HashMap<>();
        int maxSum = max << 1;
        int res = 0;
        for (int delicious : deliciousness) {
            for (int sum = 1; sum <= maxSum; sum <<= 1) {
                int count = map.getOrDefault(sum - delicious, 0);
                res = (res + count) % 1000000007;
            }
            // 不在第一次遍历中填 map, 防止重复计算
            map.put(delicious, map.getOrDefault(delicious, 0) + 1);
        }
        return res;
    }
}
