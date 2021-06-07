package com.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.*;

public class HS_BlackBox_1Test {

    @Test
    public void solution() {
        HS_BlackBox_1 test = new HS_BlackBox_1();
        int[] nums = new int[]{5, 8, 2, 6, 9, 10, 22};
        int n = nums.length, m = 4;
        System.out.println(Arrays.toString(testSolution(n, m, nums)));
        System.out.println(Arrays.toString(test.solution(n, m, nums)));
        assertArrayEquals(testSolution(n, m, nums), test.solution(n, m, nums));
    }

    private int[] testSolution(int n, int m, int[] nums) {
        Queue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            if (Integer.bitCount(o1) == Integer.bitCount(o2)) {
                return o2 - o1;
            } else {
                return Integer.bitCount(o2) - Integer.bitCount(o1);
            }
        });
        for (int i = 0; i < n; i++) {
            pq.add(nums[i]);
        }
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
}