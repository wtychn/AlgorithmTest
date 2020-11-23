package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_425_FindMinArrowShotsTest {

    @Test
    public void findMinArrowShots() {
        LC_425_FindMinArrowShots f = new LC_425_FindMinArrowShots();
        int[][] input = new int[][]{{-2147483646,-2147483645},{2147483646,2147483647}};
        System.out.println(f.findMinArrowShots(input));
    }
}