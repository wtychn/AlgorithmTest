package com.algorithm.search;
/***
 * @Description: 找差值最大值最小的路径
 * @level mid
 * @author wtychn
 * @Date 2020/10/25
 */
public class LC_5548_MinimumEffortPath {
    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int minimumEffortPath(int[][] heights) {
        int left = 0, right = 1000000;  //题目限制最大10^6
        //在深度优先搜索过程中使用二分查找找最小差值
        while (left < right) {
            int mid = (left + right) / 2;
            if (dfs(heights, new boolean[heights.length][heights[0].length], 0, 0, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean dfs(int[][] heights, boolean[][] isPassed, int i, int j, int max) {
        if (i == heights.length - 1 && j == heights[0].length - 1) {
            return true;
        }
        isPassed[i][j] = true;
        for (int[] dir : dirs) {
            int nx = i + dir[0];
            int ny = j + dir[1];
            if (nx >= 0 && nx < heights.length && ny >= 0 && ny < heights[0].length
                    && !isPassed[nx][ny]
                    && Math.abs(heights[nx][ny] - heights[i][j]) <= max) {
                if (dfs(heights, isPassed, nx, ny, max)) {
                    return true;
                }
            }
        }
        return false;
    }
}
