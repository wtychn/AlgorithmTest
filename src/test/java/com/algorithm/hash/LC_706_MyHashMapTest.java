package com.algorithm.hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_706_MyHashMapTest {

    LC_706_MyHashMap m;

    @Before
    public void myHashMap() {
        m = new LC_706_MyHashMap();
    }

    @Test
    public void put() {
        m.put(12, 10);
        System.out.println(m.get(12));
    }

    @Test
    public void get() {
        System.out.println(m.get(12));
    }

    @Test
    public void remove() {
        m.put(10, 10);
        m.put(11, 10);
        m.put(23, 10);
        m.put(3, 10);
        m.put(4, 10);

        m.remove(12);
    }
}