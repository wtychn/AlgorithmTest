package com.algorithm.search;

public class Offer_47_MaxValue {
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }

    public int maxValue_dfs(int[][] grid) {
        int sum = 0;
        return dfs(grid, 0, 0, sum);
    }
    private int dfs(int[][] grid, int i, int j, int sum) {
        if (i > grid.length - 1 || j > grid[0].length - 1) {
            return sum;
        }
        sum += grid[i][j];
        return  Math.max(dfs(grid, i + 1, j, sum),
                dfs(grid, i, j + 1, sum));
    }
}
