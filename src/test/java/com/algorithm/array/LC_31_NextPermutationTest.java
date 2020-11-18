package com.algorithm.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LC_31_NextPermutationTest {

    @Test
    public void nextPermutation() {
        LC_31_NextPermutation n = new LC_31_NextPermutation();
        int[] array = new int[]{1,1};
        n.nextPermutation(array);
        System.out.println(Arrays.toString(array));
    }
}