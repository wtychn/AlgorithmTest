package com.algorithm.array;
/***
 * @Description: 加油站
 * @level mid
 * @author wtychn
 * @Date 2020/11/18
 */
public class LC_134_CanCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int spare = 0, minSpare = Integer.MAX_VALUE, minIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            spare += gas[i] - cost[i];
            if (spare < minSpare) {
                minSpare = spare;
                minIndex = i;
            }
        }
        return spare < 0 ? -1 : (minIndex + 1) % gas.length;
    }
}
