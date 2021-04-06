package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_80_RemoveDuplicatesTest {

    @Test
    public void removeDuplicates() {
        LC_80_RemoveDuplicates r = new LC_80_RemoveDuplicates();
        System.out.println(r.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }
}