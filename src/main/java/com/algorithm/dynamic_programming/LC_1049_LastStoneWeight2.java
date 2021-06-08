package com.algorithm.dynamic_programming;

import java.util.*;
/***
 * @Description: 最后一块石头的重量2
 * @level mid
 * @author wtychn
 * @Date 2021/6/8
 */
public class LC_1049_LastStoneWeight2 {
    public int lastStoneWeightII(int[] stones) {
        int sum = Arrays.stream(stones).sum();
        int maxNeg = sum / 2;
        boolean[] dp = new boolean[maxNeg + 1];
        dp[0] = true;
        for (int stone : stones) {
            for (int i = maxNeg; i >= stone; i--) {
                dp[i] = dp[i] || dp[i - stone];
            }
        }
        for (int i = maxNeg; ; i--) {
            if(dp[i]) return sum - 2 * i;
        }
    }
}
