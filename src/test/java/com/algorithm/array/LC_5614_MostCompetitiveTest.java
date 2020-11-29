package com.algorithm.array;

import com.algorithm.stack.LC_5614_MostCompetitive;
import org.junit.Test;

import java.util.Arrays;

public class LC_5614_MostCompetitiveTest {

    @Test
    public void mostCompetitive() {
        LC_5614_MostCompetitive m = new LC_5614_MostCompetitive();
        int[] test = new int[]{84, 10, 71, 23, 66, 61, 62, 64, 34, 41, 80, 25, 91, 43, 4, 75, 65, 13, 37, 41, 46, 90, 55, 8, 85, 61, 95, 71};
        System.out.println(Arrays.toString(m.mostCompetitive(test, 24)));
    }
}