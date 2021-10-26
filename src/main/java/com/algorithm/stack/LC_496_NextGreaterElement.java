package com.algorithm.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/***
 * @Description: 下一个更大元素 1
 * @level easy
 * @author wtychn
 * @Date 2021/10/26
 */
public class LC_496_NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums2NextBigger = new HashMap<>();
        Deque<Integer> monotonicStack = new ArrayDeque<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int cur = nums2[i];
            while (!monotonicStack.isEmpty() && monotonicStack.peekLast() <= cur) {
                monotonicStack.pollLast();
            }
            if (!monotonicStack.isEmpty()) {
                nums2NextBigger.put(cur, monotonicStack.peekLast());
            }
            monotonicStack.offer(cur);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nums2NextBigger.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}
