package com.algorithm.sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestSort {
    int[] arr = new int[80000];
    int[] sortArr = new int[arr.length];
    QuickSort quickSort = new QuickSort();
    RadixSort radixSort = new RadixSort();

    @Before
    public void before() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
        sortArr = quickSort.sort(arr);
    }

    @Test
    public void testRadixSort() {
        int[] result = radixSort.sortArray(arr);
        assertArrayEquals(sortArr, result);
    }

    @Test
    public void testQuickSort() {
        int[] result = quickSort.sort(arr);
        assertArrayEquals(sortArr, result);
    }
}
