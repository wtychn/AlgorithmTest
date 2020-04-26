package com.algorithm.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer_15_CountOneTest {
    Offer_15_CountOne countOne = new Offer_15_CountOne();

    @Test
    public void hammingWeightByViolence() {
        assertEquals(3, countOne.hammingWeightByViolence(11));
    }

    @Test
    public void hammingWeightByBitOperation() {
        assertEquals(3, countOne.hammingWeightByBitOperation(11));
    }

    @Test
    public void hammingWeightBest() {
        assertEquals(3, countOne.hammingWeightBest(11));
    }
}