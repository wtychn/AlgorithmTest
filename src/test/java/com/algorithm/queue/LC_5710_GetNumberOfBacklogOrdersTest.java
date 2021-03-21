package com.algorithm.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_5710_GetNumberOfBacklogOrdersTest {

    @Test
    public void testGetNumberOfBacklogOrders() {
        LC_5710_GetNumberOfBacklogOrders g = new LC_5710_GetNumberOfBacklogOrders();
        int[][] test = new int[][]{{26, 7, 0}, {16, 1, 1}, {14, 20, 0}, {23, 15, 1}, {24, 26, 0}, {19, 4, 1}, {1, 1, 0}};
        System.out.println(g.getNumberOfBacklogOrders(test));
    }
}