package com.algorithm.string;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class DataDance_818_interviewTest {

    DataDance_818_interview main;
    Map<String, String> stringMap = new LinkedHashMap<>();

    @Before
    public void before() {
        main = new DataDance_818_interview();
        stringMap.put("/a", "/b");
        stringMap.put("/a/c", "/a/cc");
        stringMap.put("/a/b", "/a/b/f");
    }

    @Test
    public void isChild_Api() {
        int i = 1;
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            String key = entry.getKey(), val = entry.getValue();
            System.out.println("api res"  + i++ +  ": " + main.isChild_Api(key, val));
        }
    }

    @Test
    public void isChild_Pattern() {
        int i = 1;
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            String key = entry.getKey(), val = entry.getValue();
            System.out.println("pattern res"  + i++ +  ": " + main.isChild_Pattern(key, val));
        }
    }
}