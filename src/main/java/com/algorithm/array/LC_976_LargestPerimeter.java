package com.algorithm.array;

import java.util.Arrays;
/***
 * @Description: 三角形最大周长
 * @level easy
 * @author wtychn
 * @Date 2020/11/29
 */
public class LC_976_LargestPerimeter {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 3; i >= 0 ; i--) {
            if (A[i] + A[i + 1] > A[i + 2]) {
                return A[i] + A[i + 1] + A[i + 2];
            }
        }
        return 0;
    }
}
