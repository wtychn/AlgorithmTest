package com.algorithm.search;

import java.util.Arrays;
/***
 * @Description: H 指数
 * @level mid
 * @author wtychn
 * @Date 2021/7/11
 */
public class LC_274_HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;
        int l = 0, r = length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            int mNum = citations[m];
            if (mNum >= length - m) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        int count = length - l;
        return citations[l] >= count ? count : 0;
    }
}
