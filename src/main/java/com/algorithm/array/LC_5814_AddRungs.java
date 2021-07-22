package com.algorithm.array;
/***
 * @Description: 新增最少台阶数
 * @level mid
 * @author wtychn
 * @Date 2021/7/18
 */
public class LC_5814_AddRungs {
    public int addRungs(int[] rungs, int dist) {
        int cur = 0, res = 0;
        for (int rung : rungs) {
            if (rung - cur > dist) {
                res += (rung - cur) % dist == 0 ?
                        (rung - cur) / dist - 1 :
                        (rung - cur) / dist;
            }
            cur = rung;
        }
        return res;
    }
}
