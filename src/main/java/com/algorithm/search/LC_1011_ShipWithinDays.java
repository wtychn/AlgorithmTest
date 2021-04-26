package com.algorithm.search;

import java.util.Arrays;
/***
 * @Description: 在 D 天内送达包裹的能力
 * @level mid
 * @author wtychn
 * @Date 2021/4/26
 */
public class LC_1011_ShipWithinDays {
    public int shipWithinDays(int[] weights, int D) {
        int l = Arrays.stream(weights).max().getAsInt(), r = Arrays.stream(weights).sum();
        while (l < r) {
            int m = (l + r) / 2;
            int days = isAble(weights, m, D);
            if (days < 0) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    private int isAble(int[] weights, int Cap, int days) {
        int sum = 0;
        for (int weight : weights) {
            if (sum + weight > Cap) {
                days--;
                sum = 0;
            }
            sum += weight;
            if(days < 0) return days;
        }
        return days - 1;
    }
}
