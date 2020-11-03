package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_1002_CommonCharsTest {

    @Test
    public void commonChars() {
        String[] s = new String[]{"bella", "label", "roller"};
        LC_1002_CommonChars commonChars = new LC_1002_CommonChars();
        commonChars.commonChars(s);
    }
}