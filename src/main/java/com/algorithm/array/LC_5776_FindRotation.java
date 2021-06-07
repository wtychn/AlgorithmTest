package com.algorithm.array;
/***
 * @Description: 判断矩阵经轮转后是否一致
 * @level easy
 * @author wtychn
 * @Date 2021/6/7
 */
public class LC_5776_FindRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if(isSame(mat, target)) return true;
            Rotation(mat);
        }
        return false;
    }

    private void Rotation(int[][] arr) {
        int[][] tmp = new int[arr.length][arr[0].length];
        int dst = arr.length - 1;

        //顺时针旋转矩阵90度
        for (int i = 0; i < arr.length; i++, dst--)
            for (int j = 0; j < arr[0].length; j++)
                tmp[j][dst] = arr[i][j];

        //将旋转后的矩阵保存回原来的矩阵
        for (int i = 0; i < arr[0].length; i++)
            for (int j = 0; j < arr.length; j++)
                arr[i][j] = tmp[i][j];
    }

    private boolean isSame(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                if(a[i][j] != b[i][j]) return false;
        return true;
    }
}
