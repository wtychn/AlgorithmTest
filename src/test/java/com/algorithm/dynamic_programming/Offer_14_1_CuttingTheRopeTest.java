package com.algorithm.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer_14_1_CuttingTheRopeTest {

    @Test
    public void cuttingRope() {
        Offer_14_1_CuttingTheRope cuttingTheRope = new Offer_14_1_CuttingTheRope();
        assertEquals(36, cuttingTheRope.cuttingRope(10));
    }
}