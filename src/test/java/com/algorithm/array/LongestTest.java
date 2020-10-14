package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestTest {

    @Test
    public void findLongestWay() {
        Longest l = new Longest();
        System.out.println(l.findLongestWay(new int[][]{{8, 4, 1}, {6, 5, 2}}));
    }
}