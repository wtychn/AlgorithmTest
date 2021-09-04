package com.algorithm.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/***
 * @Description: 相邻相加
 * @level easy
 * @author wtychn
 * @Date 2021/9/4
 */
public class TW_9_4_1 {
    public int sumOfAdjacentElements(List<Integer> array) {
        int count = array.size();
        Queue<Integer> queue = new LinkedList<>(array);
        while (queue.size() > 2) {
            if (count >= 2) {
                queue.add(queue.poll() + queue.poll());
                count -= 2;
            } else if (count == 1) {
                queue.add(queue.poll());
                count = queue.size();
            } else {
                count = queue.size();
            }
        }
        int a = queue.poll(), b = queue.poll();
        return a * a + b * b;
    }
}
