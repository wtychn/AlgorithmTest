package com.algorithm.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer_13_ActivityScopeTest {

    @Test
    public void movingCount() {
        Offer_13_ActivityScope activityScope = new Offer_13_ActivityScope();
        int result_BFS = activityScope.movingCount_BFS(38, 15, 9);
        int result_DFS = activityScope.movingCount_DFS(2, 3, 1);
        assertEquals(135, result_BFS);
        assertEquals(3, result_DFS);
    }
}