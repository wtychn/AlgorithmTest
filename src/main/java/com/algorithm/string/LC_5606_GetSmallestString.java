package com.algorithm.string;
/***
 * @Description: 具有给定数值的最小字符串
 * @level mid
 * @author wtychn
 * @Date 2020/11/22
 */
public class LC_5606_GetSmallestString {
    public String getSmallestString(int n, int k) {
        char[] resArr = new char[n];
        int num = (k - n) / 25, remainder = (k - n) % 25;
        for (int i = 0; i < n - num - 1; i++) {
            resArr[i] = 'a';
        }
        resArr[n - num - 1] = (char) ('a' + remainder);
        for (int i = n - num; i < n; i++) {
            resArr[i] = 'z';
        }
        return new String(resArr);
    }
}
