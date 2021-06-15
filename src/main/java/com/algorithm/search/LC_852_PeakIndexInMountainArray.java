package com.algorithm.search;
/***
 * @Description: 山脉数组的峰顶索引
 * @level easy
 * @author wtychn
 * @Date 2021/6/15
 */
public class LC_852_PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 1, r = arr.length - 2;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if(arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) return m;
            else if(arr[m] > arr[m - 1] && arr[m] < arr[m + 1]) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}
