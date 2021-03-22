package com.algorithm.array;

import java.util.HashSet;
import java.util.Set;

public class LC_73_SetZeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (Integer r : row) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[r][i] = 0;
            }
        }
        for (Integer c : col) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][c] = 0;
            }
        }
    }

    public void setZeroes_O1(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean col1Flag = false;
        for (int i = 0; i < m; i++) {
            if(matrix[i][0] == 0) col1Flag = true;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    // 用第一行和第一列存储需要置零的元素
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // 为了防止第一行元素被提前更新，我们需要从最后一行开始，倒序地处理矩阵元素。
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 1; j < n; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
            if(col1Flag) matrix[i][0] = 0;
        }
    }
}
