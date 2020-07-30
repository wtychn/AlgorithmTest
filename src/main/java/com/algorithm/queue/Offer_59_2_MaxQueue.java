package com.algorithm.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: AlgorithmTest
 * @description: offer59-2
 * @author: Mr.Wang
 * @create: 2020-07-29 19:24
 **/
public class Offer_59_2_MaxQueue {
    Queue<Integer> queue;
    Deque<Integer> max;
    public Offer_59_2_MaxQueue() {
        queue = new LinkedList<>();
        max = new LinkedList<>();
    }

    public int max_value() {
        return max.isEmpty() ? -1 : max.peekFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while (!max.isEmpty() && max.peekLast() < value)
            max.pollLast();
        max.addLast(value);
    }

    public int pop_front() {
        if(queue.isEmpty()) return -1;
        else if(max.peekFirst().equals(queue.peek()))
            max.pollFirst();
        return queue.poll();
    }
}
