package com.algorithm.array;
/***
 * @Description: 有界数组中指定下标处的最大值  
 * @level mid 
 * @author wtychn
 * @Date 2021/3/22
 */
public class LC_5711_MaxValue {
    public int maxValue(int n, int index, int maxSum) {
        int left = index, right = index;
        int ans = 1;
        int rest = maxSum - n;
        while (left > 0 || right < n - 1) {
            int length = right - left + 1;
            if (rest >= length) {
                rest -= length;
                ans++;
                left = Math.max(0, left - 1);
                right = Math.min(n - 1, right + 1);
            } else {
                break;
            }
        }
        ans += rest / n;
        return ans;
    }
}
