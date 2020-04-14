package com.algorithm.linklist;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Offer_6_ReverseLinkedListTest {

    @Test
    public void reversePrint() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;

        Offer_6_ReverseLinkedList reverseLinkedList = new Offer_6_ReverseLinkedList();
        System.out.println(Arrays.toString(reverseLinkedList.reversePrint(node1)));;
    }
}