package com.algorithm.search;

/***
 * @Description: 搜索二维矩阵 2
 * @level mid
 * @author wtychn
 * @Date 2021/10/25
 */
public class LC_240_SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = 0, y = matrix[0].length - 1;
        while (x < matrix.length && y >= 0) {
            int cur = matrix[x][y];
            if (cur == target) {
                return true;
            } else if (cur < target) {
                x++;
            } else {
                y--;
            }
        }
        return false;
    }
}
