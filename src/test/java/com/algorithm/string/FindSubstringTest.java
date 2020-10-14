package com.algorithm.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindSubstringTest {

    @Test
    public void find() {
        FindSubstring f = new FindSubstring();
        System.out.println(f.find("123321", "321123", "3", "1"));
    }
}