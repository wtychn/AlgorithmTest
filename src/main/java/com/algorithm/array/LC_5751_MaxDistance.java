package com.algorithm.array;
/***
 * @Description: 下标对中的最大距离
 * @level mid
 * @author wtychn
 * @Date 2021/5/9
 */
public class LC_5751_MaxDistance {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int max = 0;
        while (i < nums1.length) {
            j = Math.max(j, i);
            while (j < nums2.length && nums1[i] <= nums2[j]) {
                max = Math.max(j - i, max);
                j++;
            }
            i++;
        }
        return max;
    }
}
