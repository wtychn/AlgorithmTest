package com.algorithm.linklist;

import org.junit.Test;

import java.util.Arrays;

public class Offer_6_ReverseLinkedListTest {

    @Test
    public void reversePrint() {
        Offer_6_ReverseLinkedList reverseLinkedList = new Offer_6_ReverseLinkedList();
        System.out.println(Arrays.toString(reverseLinkedList.reversePrint(new ListNode().test())));
    }
}