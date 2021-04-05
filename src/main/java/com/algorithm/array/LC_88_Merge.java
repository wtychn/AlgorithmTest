package com.algorithm.array;
/***
 * @Description: 合并两个有序数组  
 * @level easy 
 * @author wtychn
 * @Date 2021/4/5
 */
public class LC_88_Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, cur = 0;
        int[] merged = new int[m + n];
        while (cur < m + n) {
            if(i == m) merged[cur] = nums2[j++];
            else if(j == n) merged[cur] = nums1[i++];
            else merged[cur] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
            cur++;
        }
        System.arraycopy(merged, 0, nums1, 0, m + n);
    }
}
