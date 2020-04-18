package com.algorithm.stack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Offer_9_QueueByStacksTest {
    @Test
    public void queueTest() {
        Offer_9_QueueByStacks queueByStacks = new Offer_9_QueueByStacks();
        queueByStacks.appendTail(5);
        queueByStacks.appendTail(2);
        queueByStacks.deleteHead();
        queueByStacks.appendTail(3);
        assertEquals(2, queueByStacks.deleteHead());
        assertEquals(3, queueByStacks.deleteHead());
    }
}