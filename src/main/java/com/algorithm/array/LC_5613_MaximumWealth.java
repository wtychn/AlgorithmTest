package com.algorithm.array;
/***
 * @Description: 最富有客户的资产总量
 * @level easy
 * @author wtychn
 * @Date 2020/11/29
 */
public class LC_5613_MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] a : accounts) {
            int sum = 0;
            for (int num : a) {
                sum += num;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
