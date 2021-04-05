package com.algorithm.array;

import java.util.PriorityQueue;
/***
 * @Description: 魔塔游戏  
 * @level mid 
 * @author wtychn
 * @Date 2021/4/5
 */
public class LCSpring_3_MagicTower {
    public int magicTower(int[] nums) {
        long count = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long negativeSum = 0;
        int res = 0;

        for (int num : nums) {
            if (num >= 0) {
                count += num;
            } else {
                pq.add(num);
                while (!pq.isEmpty() && count + num < 0) {
                    count -= pq.peek();
                    negativeSum += pq.poll();
                    res++;
                }
                count += num;
                if (count <= 0) return -1;
            }
        }
        if(count + negativeSum <= 0) return -1;
        return res;
    }
}
