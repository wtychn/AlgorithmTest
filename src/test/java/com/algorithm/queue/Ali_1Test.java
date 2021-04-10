package com.algorithm.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ali_1Test {

    @Test
    public void testSolution() {
        Ali_1 a = new Ali_1();
        int[][] array = new int[][]{{1, 3}, {1, 4}};
        int[][] array2 = new int[][]{{1, 5}, {1, 1}, {2, 3}};
        int[][] array3 = new int[][]{{2, 5}, {2, 4}, {2, 3}};
        System.out.println(a.solution(array3));
    }
}