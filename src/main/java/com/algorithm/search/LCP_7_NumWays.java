package com.algorithm.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * @Description: 传递信息
 * @level easy
 * @author wtychn
 * @Date 2021/7/1
 */
public class LCP_7_NumWays {
    /**
     * 深度优先搜索
     */
    Map<Integer, List<Integer>> map;
    int res, target, k;

    public int numWays(int n, int[][] relation, int k) {
        map = new HashMap<>();
        res = 0;
        target = n - 1;
        this.k = k;
        for (int[] route : relation) {
            if (map.containsKey(route[0])) {
                map.get(route[0]).add(route[1]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(route[1]);
                map.put(route[0], list);
            }
        }
        recur(0, 0);
        return res;
    }

    private void recur(int key, int count) {
        if(count > k || !map.containsKey(key)) return;
        for (Integer num : map.get(key)) {
            if (num == target && k == count + 1) {
                res++;
                return;
            }
            recur(num, count + 1);
        }
    }
//    ==========================================================

    /**
     * 动态规划
     */
    public int numWays_dp(int n, int[][] relation, int k) {
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < k; i++) {
            int[] next = new int[n];
            for (int[] rel : relation) {
                next[rel[1]] += dp[rel[0]];
            }
            dp = next;
        }
        return dp[n - 1];
    }
}
