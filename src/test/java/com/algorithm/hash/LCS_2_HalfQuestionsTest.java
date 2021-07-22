package com.algorithm.hash;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCS_2_HalfQuestionsTest {

    @Test
    public void halfQuestions() {
        LCS_2_HalfQuestions h = new LCS_2_HalfQuestions();
        System.out.println(h.halfQuestions(new int[]{3, 13, 7, 11, 1, 5, 5, 3}));
    }
}