package com.algorithm.array;

import java.util.PriorityQueue;
/***
 * @Description: 最后一块石头的重量  
 * @level easy 
 * @author wtychn
 * @Date 2020/12/30
 */
public class LC_1046_LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stoneQueue = new PriorityQueue<>((a, b) -> b - a);
        for (int s : stones) {
            stoneQueue.add(s);
        }
        while (stoneQueue.size() > 1) {
            int a = stoneQueue.poll();
            int b = stoneQueue.poll();
            if (a - b != 0) {
                stoneQueue.add(a - b);
            }
        }
        return stoneQueue.isEmpty() ? 0 : stoneQueue.poll();
    }
}
