package com.algorithm.search;

import com.algorithm.string.Offer_5_ReplaceSpace;
import org.junit.Test;

public class Offer_5_ReplaceSpaceTest {

    @Test
    public void replaceSpace() {
        Offer_5_ReplaceSpace replaceSpace = new Offer_5_ReplaceSpace();
        String s = "We are happy.";
        s = replaceSpace.replaceSpace(s);
        System.out.println(s);
    }
}