package com.algorithm.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class offer_11_SearchRotationPointTest {

    @Test
    public void minArrayTest() {
        offer_11_SearchRotationPoint searchRotationPoint = new offer_11_SearchRotationPoint();
        int[] test = {2, 2, 2, 0, 2};
        assertEquals(0,searchRotationPoint.minArray(test));
    }
}