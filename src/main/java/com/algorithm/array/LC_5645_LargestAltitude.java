package com.algorithm.array;
/***
 * @Description: 找到最高海拔  
 * @level easy
 * @author wtychn
 * @Date 2021/1/24
 */
public class LC_5645_LargestAltitude {
    public int largestAltitude(int[] gain) {
        int last = 0, max = 0;
        for (int n : gain) {
            max = Math.max(max, last + n);
            last += n;
        }
        return max;
    }
}
