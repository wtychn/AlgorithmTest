package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_15_ThreeSumTest {

    @Test
    public void threeSum() {
        LC_15_ThreeSum threeSum = new LC_15_ThreeSum();
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum.threeSum(nums));
    }
}