package com.algorithm.array;
/***
 * @Description: 按奇偶重新排序数组
 * @level easy
 * @author wtychn
 * @Date 2020/11/12
 */
public class LC_922_SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int e = 0, o = 1;
        for (int j : A) {
            if (j % 2 == 0) {
                res[e] = j;
                e += 2;
            } else {
                res[o] = j;
                o += 2;
            }
        }
        return res;
    }
}
