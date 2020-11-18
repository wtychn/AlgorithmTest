package com.algorithm.array;
/***
 * @Description: 判断数组是否为山脉
 * @level easy
 * @author wtychn
 * @Date 2020/11/3
 */
public class LC_941_ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int max = -1, index = 0;
        while (index < A.length && A[index] > max) {
            max = A[index];
            index++;
        }
        if(index <= 1 || index == A.length) return false;
        while (index < A.length && A[index] < A[index - 1]) {
            index++;
        }
        return index == A.length;
    }
}
