package com.algorithm.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LC_5539_FrequencySortTest {

    @Test
    public void frequencySort() {
        LC_5539_FrequencySort f = new LC_5539_FrequencySort();
        System.out.println(Arrays.toString(f.frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1})));
    }
}