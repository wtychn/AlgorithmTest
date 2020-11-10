package com.algorithm.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LC_973_KClosestTest {

    @Test
    public void kClosest() {
        LC_973_KClosest k = new LC_973_KClosest();
        System.out.println(Arrays.deepToString(k.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1)));
    }
}