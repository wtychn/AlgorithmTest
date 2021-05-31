package com.algorithm.search;

import java.util.Arrays;
/***
 * @Description: 准时到达的列车最小时速
 * @level mid
 * @author wtychn
 * @Date 2021/5/23
 */
public class LC_5764_MinSpeedOnTime {
    public int minSpeedOnTime(int[] dist, double hour) {
        if(hour < dist.length - 1) return -1;
        int sum = Arrays.stream(dist).sum();
        int l = (int) (sum / hour), r = Integer.MAX_VALUE;
        while (l < r) {
            long m2 = (long) l + r;
            int m = (int) (m2 / 2);
            if (canReach(dist, hour, m)) r = m;
            else l = m + 1;
        }
        return l;
    }

    private boolean canReach(int[] dist, double hour, int speed) {
        double time = 0;
        for (int i = 0; i < dist.length - 1; i++) {
            time += Math.ceil((double) dist[i] / speed);
        }
        time += (double) dist[dist.length - 1] / speed;
        return time <= hour;
    }
}
