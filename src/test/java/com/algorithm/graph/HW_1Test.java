package com.algorithm.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class HW_1Test {

    @Test
    public void groupCount() {
        HW_1 h1 = new HW_1();
        String[][] names = new String[][]{
                {"Jack", "Tom"},
                {"Alice", "John"},
                {"Jessica", "Leonie"},
                {"Tom", "Alice"},
                {"John", "Jack"},
                {"Leonie", "Jessica"}
        };
        System.out.println(h1.groupCount(names));
    }
}