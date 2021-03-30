package com.algorithm.search;
/***
 * @Description: 搜索二维矩阵  
 * @level mid 
 * @author wtychn
 * @Date 2021/3/30
 */
public class LC_74_SearchMatrix {

    int[][] matrix;
    int target;

    public boolean searchMatrix(int[][] matrix, int target) {
        this.matrix = matrix;
        this.target = target;
        return binarySearch_row(0, matrix.length - 1);
    }

    private boolean binarySearch_row(int left, int right) {
        if(left > right) return false;
        int mid = (left + right) / 2;
        int mNum = matrix[mid][0];
        if (mNum > target) {
            return binarySearch_row(left, mid - 1);
        } else {
            if (mid == matrix.length - 1 || matrix[mid + 1][0] > target) {
                return binarySearch_col(matrix[mid], 0, matrix[0].length - 1);
            }
            return binarySearch_row(mid + 1, right);
        }
    }

    private boolean binarySearch_col(int[] arrays, int left, int right) {
        if(left > right) return false;
        int mid = (left + right) / 2;
        int mNum = arrays[mid];
        if (mNum > target) {
            return binarySearch_col(arrays, left, mid - 1);
        } else if (mNum < target) {
            return binarySearch_col(arrays, mid + 1, right);
        } else {
            return true;
        }
    }
}
