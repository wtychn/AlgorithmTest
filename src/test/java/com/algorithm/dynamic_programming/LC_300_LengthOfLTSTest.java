package com.algorithm.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_300_LengthOfLTSTest {

    @Test
    public void lengthOfLIS() {
        LC_300_LengthOfLTS l = new LC_300_LengthOfLTS();
        System.out.println(l.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}