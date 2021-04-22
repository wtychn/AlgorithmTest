package com.algorithm.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_363_MaxSumSubmatrixTest {

    @Test
    public void maxSumSubmatrix() {
        LC_363_MaxSumSubmatrix m = new LC_363_MaxSumSubmatrix();
        int[][] matrix = new int[][]{{5, -4, -3, 4}, {-3, -4, 4, 5}, {5, 1, 5, -4}};
        System.out.println(m.maxSumSubmatrix(matrix, 8));
    }
}