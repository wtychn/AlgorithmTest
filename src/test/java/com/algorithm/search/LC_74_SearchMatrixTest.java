package com.algorithm.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_74_SearchMatrixTest {

    @Test
    public void searchMatrix() {
        LC_74_SearchMatrix s = new LC_74_SearchMatrix();
        int[][] matrix = new int[][]{{2, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(s.searchMatrix(matrix, 65));
    }
}