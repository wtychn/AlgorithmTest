package com.algorithm.array;
/***
 * @Description: 图像旋转
 * @level mid
 * @author wtychn
 * @Date 2020/11/18
 */
public class LC_48_Rotate {
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0 || matrix.length != matrix[0].length) return;
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[length - 1 - j][length - 1 - i];
                matrix[length - 1 - j][length - 1 - i] = tmp;
            }
        }
        for (int i = 0; i < length / 2; i++) {
            for (int j = 0; j < length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[length - 1 - i][j];
                matrix[length - 1 - i][j] = tmp;
            }
        }
    }
}
