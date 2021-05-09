package com.algorithm.search;
/***
 * @Description: 制作 m 束花所需的最少天数
 * @level mid
 * @author wtychn
 * @Date 2021/5/9
 */
public class LC_1482_MinDays {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m * k < bloomDay.length) return -1;
        int minDay = Integer.MAX_VALUE, maxDay = 0;
        for (int j : bloomDay) {
            minDay = Math.min(j, minDay);
            maxDay = Math.max(j, maxDay);
        }
        int l = minDay, r = maxDay;
        while (l < r) {
            int mid = (l + r) / 2;
            if (check(bloomDay, mid, m, k)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean check(int[] bloomDay, int day, int m, int k) {
        int bouquets = 0;
        int curFlowers = 0;
        for (int i = 0; i < bloomDay.length && bouquets < m; i++) {
            if (bloomDay[i] <= day) {
                curFlowers++;
                if (curFlowers == k) {
                    bouquets++;
                    curFlowers = 0;
                }
            } else {
                curFlowers = 0;
            }
        }
        return bouquets >= m;
    }
}
