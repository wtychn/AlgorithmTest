package com.algorithm.array;
/***
 * @Description: 图像旋转
 * @level mid
 * @author wtychn
 * @Date 2020/11/18
 */
public class LC_48_Rotate {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        // 上下翻转
        for (int i = 0; i < length / 2; i++) {
            for (int j = 0; j < length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[length - 1 - i][j];
                matrix[length - 1 - i][j] = tmp;
            }
        }
        // 对角线换位
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}
