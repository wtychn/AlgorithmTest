package com.algorithm.array;
/***
 * @Description: 最长湍流子数组
 * @level mid
 * @author wtychn
 * @Date 2021/2/8
 */
public class LC_978_MaxTurbulenceSize {
    public int maxTurbulenceSize(int[] arr) {
        int max = 1, left = 0;
        boolean isBigger = arr[0] > arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                left = i;
            } else {
                if ((isBigger && arr[i] > arr[i - 1]) || (!isBigger && arr[i] < arr[i - 1])) {
                    isBigger = !isBigger;
                } else {
                    left = i - 1;
                    isBigger = arr[i] < arr[i - 1];
                }
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
