package com.algorithm.math;
/***
 * @Description: 子数组异或查询
 * @level mid
 * @author wtychn
 * @Date 2021/5/12
 */
public class LC_1310_XorQueries {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] ^ arr[i];
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < res.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            if (l == 0) {
                res[i] = prefix[r];
            } else {
                res[i] = prefix[r] ^ prefix[l - 1];
            }
        }
        return res;
    }

}
