package com.algorithm.search;
/***
 * @Description: 求岛屿周长
 * @level easy
 * @author wtychn
 * @Date 2020/10/30
 */
public class LC_463_IslandPerimeter {
    int[][] dir = new int[][]{
            {0, 1}, //右移
            {0, -1}, //左移
            {1, 0}, //下移
            {-1, 0} //上移
    };
    int res = 0;
    boolean[][] isVisit;

    public int islandPerimeter(int[][] grid) {
        int row = 0, col = 0;
        isVisit = new boolean[grid.length][grid[0].length];
        while (row < grid.length && grid[row][col] != 1) {
            col++;
            if (col >= grid[0].length) {
                col = 0;
                row++;
            }
        }
        dfs(grid, row, col);
        return res;
    }

    public void dfs(int[][] grid, int row, int col) {
        int perimeter = 4;
        isVisit[row][col] = true;
        for (int[] ints : dir) {
            int newRow = row + ints[0];
            int newCol = col + ints[1];
            if (newRow < grid.length && newCol < grid[0].length && newCol >=0 && newRow >= 0
                    && grid[newRow][newCol] == 1) {
                if(!isVisit[newRow][newCol]) dfs(grid, newRow, newCol);
                perimeter -= 1;
            }
        }
        res += perimeter;
    }
}
