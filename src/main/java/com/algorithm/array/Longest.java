package com.algorithm.array;

public class Longest {
    int res;
    public int findLongestWay(int[][] matrix) {
        res = 0;
        dfs(matrix, 0, 0, Integer.MAX_VALUE, 0);
        return res;
    }

    private void dfs(int[][] matrix, int row, int column, int last, int length) {
        if (row < 0 || row >= matrix.length || column < 0 || column >= matrix[0].length) {
            res = Math.max(length, res);
            return;
        }
        if(matrix[row][column] >= last) return;
        length += 1;
        if(row < matrix.length) dfs(matrix, row + 1, column, matrix[row][column], length);
        if(row >= 0) dfs(matrix, row - 1, column, matrix[row][column], length);
        if(column < matrix[0].length) dfs(matrix, row, column + 1, matrix[row][column], length);
        if(column >= 0) dfs(matrix, row, column - 1, matrix[row][column], length);
    }
}
