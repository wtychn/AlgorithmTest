package com.algorithm.hash;

import java.util.*;
/***
 * @Description: 使数组元素相等的减少操作次数
 * @level mid
 * @author wtychn
 * @Date 2021/6/7
 */
public class LC_5777_ReductionOperations {
    public int reductionOperations(int[] nums) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
                pq.add(num);
            }
        }
        int count = 0;
        while (pq.size() > 1) {
            int largest = pq.poll();
            int nextLargest = pq.peek();
            count += map.get(largest);
            map.put(nextLargest, map.get(largest) + map.get(nextLargest));
            map.remove(largest);
        }
        return count;
    }
}
