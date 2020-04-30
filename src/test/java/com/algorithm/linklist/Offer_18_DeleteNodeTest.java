package com.algorithm.linklist;

import org.junit.Test;

public class Offer_18_DeleteNodeTest {

    @Test
    public void deleteNode() {
        Offer_18_DeleteNode deleteNode = new Offer_18_DeleteNode();
        ListNode help = new ListNode();
        System.out.println(help.toArray(deleteNode.deleteNode(help.test(), 1)));
    }
}