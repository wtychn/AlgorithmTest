package com.algorithm.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_123_MaxProfitTest {

    @Test
    public void maxProfit() {
        LC_123_MaxProfit m = new LC_123_MaxProfit();
        System.out.println(m.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
    }
}