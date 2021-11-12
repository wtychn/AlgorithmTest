package com.algorithm.search;

/***
 * @Description: 猜数字大小2
 * @level mid
 * @author wtychn
 * @Date 2021/11/12
 */
public class LC_375_GetMoneyAmount {
    int[][] cache;
    public int getMoneyAmount(int n) {
        cache = new int[n + 10][n + 10];
        return dfs(1, n);
    }

    private int dfs(int l, int r) {
        if (l >= r) {
            return 0;
        }
        if (cache[l][r] != 0) {
            return cache[l][r];
        }
        int res = Integer.MAX_VALUE;
        for (int x = l; x <= r; x++) {
            int cur = Math.max(dfs(l, x - 1), dfs(x + 1, r)) + x;
            res = Math.min(cur, res);
        }
        cache[l][r] = res;
        return res;
    }
}
