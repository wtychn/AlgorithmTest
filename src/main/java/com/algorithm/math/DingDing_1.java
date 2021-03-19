package com.algorithm.math;

import java.util.Arrays;

/***
 * @Description: 找数列中能够将一半的数变成平方数的改动数量  
 * @level  
 * @author wtychn
 * @Date 2021/3/19
 */

public class DingDing_1 {

    private int solution(int n, int[] a) {
        int[] counts = new int[n];
        for (int i = 0; i < n; i++) {
            int cache = a[i];
            int c;
            int count1 = 0, count2 = 0;
            if (Math.sqrt(cache) != (int) Math.sqrt(cache)) {
                c = (int) Math.sqrt(cache) + 1;
                count1 = c * c - cache;
            }
            if (cache > 0 && Math.sqrt(cache) != (int) Math.sqrt(cache)) {
                c = (int) Math.sqrt(cache);
                count2 = cache - c * c;
            }
            counts[i] = Math.min(count1, count2);
        }
        Arrays.sort(counts);
        int res = 0;
        for (int i = 0; i < n / 2; i++) {
            res += counts[i];
        }
        return res;
    }
    
}
