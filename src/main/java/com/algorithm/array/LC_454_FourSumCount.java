package com.algorithm.array;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 四数相加Ⅱ
 * @level mid
 * @author wtychn
 * @Date 2020/11/27
 */
// 总结，看到形如：A+B....+N=0的式子，
// 要转换为(A+...T)=-((T+1)...+N)再计算，这个T的分割点一般是一半，
// 特殊情况下需要自行判断。定T是解题的关键。
public class LC_454_FourSumCount {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> abSumMap = new HashMap<>();
        int count = 0;
        for (int a : A) {
            for (int b : B) {
                int sum = a + b;
                abSumMap.put(sum, abSumMap.getOrDefault(sum, 0) + 1);
            }
        }
        for (int c : C) {
            for (int d : D) {
                int sum = c + d;
                if(abSumMap.containsKey(-sum)) count += abSumMap.get(-sum);
            }
        }
        return count;
    }
}
