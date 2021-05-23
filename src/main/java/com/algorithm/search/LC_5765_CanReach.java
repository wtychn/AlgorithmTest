package com.algorithm.search;

import java.util.*;
/***
 * @Description: 跳跃游戏7
 * @level mid
 * @author wtychn
 * @Date 2021/5/23
 */
public class LC_5765_CanReach {
    public boolean canReach(String s, int minJump, int maxJump) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        Queue<Integer> dfsQueue = new LinkedList<>();
        Queue<Integer> zero = new LinkedList<>();
        for (int i = 1; i < n; i++) {
            if(arr[i] == '0') zero.offer(i);
        }
        dfsQueue.offer(0);
        while (!dfsQueue.isEmpty()) {
            int cur = dfsQueue.poll();
            if(cur == n - 1) return true;
            while (!zero.isEmpty() && zero.peek() <= cur + maxJump) {
                if (zero.peek() >= cur + minJump) {
                    dfsQueue.offer(zero.peek());
                }
                zero.poll();
            }
        }
        return false;
    }
}
