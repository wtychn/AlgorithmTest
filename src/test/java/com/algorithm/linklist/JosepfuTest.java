package com.algorithm.linklist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JosepfuTest {

    @Test
    public void lastRemaining() {
        Josepfu josepfu = new Josepfu();
        assertEquals(2, josepfu.lastRemaining(10, 17));
    }
}