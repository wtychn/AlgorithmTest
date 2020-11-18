package com.algorithm.array;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: AlgorithmTest
 * @description: offer59
 * @author: Mr.Wang
 * @create: 2020-07-27 19:46
 **/
public class Offer_59_MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < res.length; i++) {
            int max = nums[i];
            for (int j = i; j < i + k; j++) {
                max = Math.max(nums[j], max);
            }
            res[i] = max;
        }
        return res;
    }

    public int[] maxSlidingWindow_deque(int[] nums, int k){
        if(nums == null || nums.length == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        //未形成窗口时
        for (int i = 0; i < k; i++) {
            //循环使得队列中first位置始终是滑动窗口最大值
            while (!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
        }
        res[0] = deque.peekFirst();
        //形成窗口后
        for (int i = k; i < nums.length; i++) {
            //如果队列中最大值是滑动窗口移除的值，则移除最大值
            if (deque.peekFirst() == nums[i - k])
                deque.removeFirst();
            while (!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;
    }
}
