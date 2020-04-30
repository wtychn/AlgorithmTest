package com.algorithm.dynamic_programming;

import com.algorithm.string.Offer_15_CountOne;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer_16_PowerTest {

    @Test
    public void myPow() {
        Offer_16_Power power = new Offer_16_Power();
        double result = 1024;
        assertEquals(result, power.myPow(2, 10), 0);
    }
}