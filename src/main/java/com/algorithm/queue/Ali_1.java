package com.algorithm.queue;

import java.util.*;

public class Ali_1 {
    public List<Integer> solution(int[][] arrays) {
        int curTime = 1;
        int number = 1;
        List<Integer> res = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>(Arrays.asList(arrays));
        while (!queue.isEmpty()) {
            while (!queue.isEmpty() && queue.peek()[1] < curTime) {
                queue.poll();
                res.add(0);
                number++;
            }
            if (!queue.isEmpty() && queue.peek()[0] <= curTime) {
                queue.poll();
                res.add(number);
                number++;
            }
            curTime++;
        }
        return res;
    }
}
