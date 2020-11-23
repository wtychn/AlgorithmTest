package com.algorithm.array;

import junit.framework.TestCase;

public class LC_134_CanCompleteCircuitTest extends TestCase {

    public void testCanCompleteCircuit() {
        LC_134_CanCompleteCircuit c = new LC_134_CanCompleteCircuit();
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        System.out.println(c.canCompleteCircuit(gas, cost));
    }
}