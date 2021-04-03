package com.algorithm.dynamic_programming;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_42_TrapTest {

    LC_42_Trap t;
    int[] test;

    @Before
    public void before() {
        t = new LC_42_Trap();
        test = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    }

    @Test
    public void trap_dp() {
        System.out.println(t.trap_dp(test));
    }

    @Test
    public void trap_stack() {
        System.out.println(t.trap_stack(test));
    }

    @Test
    public void trap_doublePointers() {
        System.out.println(t.trap_doublePointers(test));
    }
}