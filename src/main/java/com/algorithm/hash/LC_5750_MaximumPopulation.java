package com.algorithm.hash;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 人口最多的年份
 * @level easy
 * @author wtychn
 * @Date 2021/5/9
 */
public class LC_5750_MaximumPopulation {
    public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0, year = Integer.MAX_VALUE;
        for (int[] log : logs) {
            for (int j = log[0]; j < log[1]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
                if (map.get(j) > max) {
                    max = map.get(j);
                    year = j;
                }
                if(map.get(j) == max) year = Math.min(year, j);
            }
        }
        return year;
    }
}
