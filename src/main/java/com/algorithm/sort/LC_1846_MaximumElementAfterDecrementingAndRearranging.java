package com.algorithm.sort;
/***
 * @Description: 减小和重新排列数组后的最大元素
 * @level mid
 * @author wtychn
 * @Date 2021/7/15
 */
public class LC_1846_MaximumElementAfterDecrementingAndRearranging {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int[] freq = new int[arr.length + 1];
        for (int num : arr) {
            freq[Math.min(num, arr.length)]++;
        }
        int count = 0;
        for (int i = 1; i < freq.length; i++) {
            count += freq[i] == 0 ? 1 : -Math.min(freq[i] - 1, count);
        }
        return arr.length - count;
    }
}
