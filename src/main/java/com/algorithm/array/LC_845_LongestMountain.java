package com.algorithm.array;
/***
 * @Description: 寻找连续递增递减的最大长度（山脉最大长度）
 * @level  mid
 * @author wtychn
 * @Date 2020/10/25
 */
public class LC_845_LongestMountain {
    public int longestMountain(int[] A) {
        int l = 0, r;
        int max = 0;
        while (l < A.length) {
            int h = l + 1;
            int highest = A[l];
            while (h < A.length && A[h] > highest) {
                highest = A[h];
                h++;
            }
            h--;
            r = h + 1;
            if (r < A.length && A[h] > A[l]) {
                while (r < A.length && A[r] < A[r - 1]) {
                    r++;
                }
                if (r - l >= 3 && r - l > max) {
                    max = r - l;
                }
                l = r - 1;
            } else {
                l = r;
            }
        }
        return max;
    }
}
