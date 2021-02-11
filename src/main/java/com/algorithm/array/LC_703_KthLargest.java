package com.algorithm.array;

import java.util.PriorityQueue;
/***
 * @Description: 数据流中的第K大元素
 * @level easy
 * @author wtychn
 * @Date 2021/2/11
 */
public class LC_703_KthLargest {
    PriorityQueue<Integer> pq;
    int k;

    public LC_703_KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }
    }

    public int add(int val) {
        pq.add(val);
        while (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }
}
