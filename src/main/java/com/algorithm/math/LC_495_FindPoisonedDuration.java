package com.algorithm.math;

/***
 * @Description: 提莫攻击
 * @level easy
 * @author wtychn
 * @Date 2021/11/10
 */
public class LC_495_FindPoisonedDuration {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int lastTime = timeSeries[0] + duration;
        int overTime = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            overTime += Math.max(0, lastTime - timeSeries[i]);
            lastTime = timeSeries[i] + duration;
        }
        return timeSeries.length * duration - overTime;
    }
}
