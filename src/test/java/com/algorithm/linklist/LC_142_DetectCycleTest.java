package com.algorithm.linklist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_142_DetectCycleTest {

    @Test
    public void detectCycle() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node2;

        LC_142_DetectCycle detectCycle = new LC_142_DetectCycle();
        detectCycle.detectCycle(node1);
    }
}