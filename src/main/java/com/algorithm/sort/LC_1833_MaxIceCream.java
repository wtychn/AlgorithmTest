package com.algorithm.sort;

import java.util.Arrays;
/***
 * @Description: 雪糕的最大数量
 * @level mid
 * @author wtychn
 * @Date 2021/7/2
 */
public class LC_1833_MaxIceCream {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res = 0, sum = 0;
        for (int cost : costs) {
            sum += cost;
            if(sum > coins) return res;
            else res++;
        }
        return res;
    }
}
