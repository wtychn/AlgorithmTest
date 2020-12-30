package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_5638_EatenApplesTest {

    @Test
    public void eatenApples() {
        LC_5638_EatenApples e = new LC_5638_EatenApples();
        int[] a = new int[]{9, 10, 1, 7, 0, 2, 1, 4, 1, 7, 0, 11, 0, 11, 0, 0, 9, 11, 11, 2, 0, 5, 5};
        int[] b = new int[]{3, 19, 1, 14, 0, 4, 1, 8, 2, 7, 0, 13, 0, 13, 0, 0, 2, 2, 13, 1, 0, 3, 7};
        assertEquals(e.eatenApples(a, b), 31);
    }
}