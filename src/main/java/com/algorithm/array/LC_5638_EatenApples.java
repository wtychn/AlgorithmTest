package com.algorithm.array;
/***
 * @Description: 吃苹果的最大数目
 * @level mid
 * @author wtychn
 * @Date 2020/12/27
 */
public class LC_5638_EatenApples {
    public int eatenApples(int[] apples, int[] days) {
        int ans = 0;
        int n = apples.length, eaten = 0, noEaten = 0;
        for (int i = 0; i < n; ++i) {
            int eat = Math.min(days[i], apples[i]);
            if (apples[i] != 0 && i + days[i] > eaten)
                eaten = i + days[i];
            if (i >= eaten)
                noEaten--;
            ans += eat;
        }
        return Math.min(ans, eaten + noEaten);
    }
}
