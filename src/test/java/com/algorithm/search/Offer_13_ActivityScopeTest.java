package com.algorithm.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer_13_ActivityScopeTest {

    @Test
    public void movingCount() {
        Offer_13_ActivityScope activityScope = new Offer_13_ActivityScope();
        int result = activityScope.movingCount(2, 3, 1);
        assertEquals(3, result);
    }
}