package com.algorithm.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer_5_ReplaceSpaceTest {

    @Test
    public void replaceSpace() {
        Offer_5_ReplaceSpace replaceSpace = new Offer_5_ReplaceSpace();
        String s = "We are happy.";
        s = replaceSpace.replaceSpace(s);
        System.out.println(s);
    }
}