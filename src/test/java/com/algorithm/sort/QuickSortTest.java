package com.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void sort() {
        QuickSort quickSort = new QuickSort();
        final int[] arr = { 53, 3, 42, 14, 748, 214 };
        try {
            System.out.println(Arrays.toString(quickSort.sort(arr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}