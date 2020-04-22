package com.algorithm.search;

import java.util.LinkedList;
import java.util.Queue;

public class Offer_13_ActivityScope {
    boolean[][] table;
    int k;
    public int movingCount_BFS(int m, int n, int k) {
        table = new boolean[m][n];
        this.k = k;
        return countSum(0, 0, 0, 0);
    }

    private int countSum(int row, int column, int sr, int sc) {
        if (sr + sc > k
                || row > table.length - 1
                || column > table[0].length - 1
                || table[row][column]) {
            return 0;
        }
        table[row][column] = true;
        return 1 + countSum(row + 1, column, (row + 1) % 10 == 0 ? sr - 8 : sr + 1, sc)
                + countSum(row, column + 1, sr, (column + 1) % 10 == 0 ? sc - 8 : sc + 1);
    }
    

    public int movingCount_DFS(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0, 0});
        int result = 0;
        while (!queue.isEmpty()) {
            int[] index = queue.poll();
            int i = index[0], j = index[1], si = index[2], sj = index[3];
            if (i > m - 1 || j > n - 1 || k < si + sj || visited[i][j]) {
                continue;
            }
            result++;
            visited[i][j] = true;
            queue.add(new int[]{i + 1, j, (i + 1) % 10 == 0 ? si - 8 : si + 1, sj});
            queue.add(new int[]{i, j + 1, si, (j + 1) % 10 == 0 ? sj - 8 : sj + 1});
        }
        return result;
    }
}
