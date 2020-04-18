package com.algorithm.recur;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer_10_1_FibonacciTest {

    @Test
    public void fib() {
        Offer_10_1_Fibonacci fibonacci = new Offer_10_1_Fibonacci();
        int[] test = {2, 3, 44, 45};
        int[] result = {1, 2, 701408733, 134903163};
        for (int i = 0; i < test.length; i++) {
            test[i] = fibonacci.fib(test[i]);
        }
        assertArrayEquals(result, test);
    }
}