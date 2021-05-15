package com.algorithm.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_403_CanCrossTest {

    @Test
    public void canCross() {
        LC_403_CanCross l = new LC_403_CanCross();
        System.out.println(l.canCross(new int[]{0, 1, 3, 5, 6, 8, 12, 17}));
    }
}