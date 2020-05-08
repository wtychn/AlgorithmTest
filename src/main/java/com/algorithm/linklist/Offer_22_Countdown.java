package com.algorithm.linklist;

public class Offer_22_Countdown {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode low = head, fast = head;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            low = low.next;
            fast = fast.next;
        }
        return low;
    }
}
