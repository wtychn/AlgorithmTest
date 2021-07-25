package com.algorithm.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/***
 * @Description: 从相邻元素对还原数组
 * @level mid
 * @author wtychn
 * @Date 2021/7/25
 */
public class LC_1743_RestoreArray {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] adjacentPair : adjacentPairs) {
            map.putIfAbsent(adjacentPair[0], new ArrayList<>());
            map.putIfAbsent(adjacentPair[1], new ArrayList<>());
            map.get(adjacentPair[0]).add(adjacentPair[1]);
            map.get(adjacentPair[1]).add(adjacentPair[0]);
        }
        int[] res = new int[adjacentPairs.length + 1];
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() == 1) {
                res[0] = entry.getKey();
                break;
            }
        }
        res[1] = map.get(res[0]).get(0);
        for (int i = 2; i < res.length; i++) {
            List<Integer> list = map.get(res[i - 1]);
            for (Integer num : list) {
                if(num != res[i - 2]) res[i] = num;
            }
        }
        return res;
    }
}
