package com.algorithm.linklist;

public class Offer_6_ReverseLinkedList {
    public int[] reversePrint(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int[] ints = new int[count];
        temp = head;
        for (int i = count - 1; i >= 0; i--) {
            ints[i] = temp.val;
            temp = temp.next;
        }
        return ints;
    }
}

