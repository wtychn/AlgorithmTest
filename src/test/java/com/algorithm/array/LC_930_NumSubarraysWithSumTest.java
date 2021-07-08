package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_930_NumSubarraysWithSumTest {

    @Test
    public void numSubarraysWithSum() {
        LC_930_NumSubarraysWithSum n = new LC_930_NumSubarraysWithSum();
        System.out.println(n.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
    }
}