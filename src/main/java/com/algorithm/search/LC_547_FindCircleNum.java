package com.algorithm.search;
/***
 * @Description: 省份数量  
 * @level mid
 * @author wtychn
 * @Date 2021/1/7
 */
public class LC_547_FindCircleNum {
    public int findCircleNum(int[][] isConnected) {
        boolean[] isVisited = new boolean[isConnected.length];
        int res = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!isVisited[i]) {
                dfs(isConnected, isVisited, i);
                res++;
            }
        }
        return res;
    }

    private void dfs(int[][] isConnected, boolean[] isVisited, int i) {
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !isVisited[j]) {
                isVisited[j] = true;
                dfs(isConnected, isVisited, j);
            }
        }
    }
}
