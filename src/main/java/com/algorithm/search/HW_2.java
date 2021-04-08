package com.algorithm.search;
/***
 * @Description: 找到符合条件的最大值路径  
 * @level mid
 * @author wtychn
 * @Date 2021/4/8
 */
public class HW_2 {
    int max, t;
    int[][] matrix;
    public int solution(int[][] matrix, int t) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) 
            return -1;
        max = -1;
        this.t = t;
        this.matrix = matrix;
        dfs(0, 0, 0);
        return max;
    }

    private void dfs(int i, int j, int sum) {
        sum += matrix[i][j];
        if (sum > t) return;
        if (i == matrix.length - 1 && j == matrix[0].length - 1) {
            max = Math.max(max, sum);
            return;
        }
        if(i < matrix.length - 1) dfs(i + 1, j, sum);
        if(j < matrix[0].length - 1) dfs(i, j + 1, sum);
    }
}
