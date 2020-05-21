package com.algorithm.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer_31_ValidateStackSequencesTest {

    @Test
    public void validateStackSequences() {
        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {4, 5, 3, 2, 1};
        Offer_31_ValidateStackSequences validateStackSequences = new Offer_31_ValidateStackSequences();
        assertTrue(validateStackSequences.validateStackSequences(push, pop));
    }
}