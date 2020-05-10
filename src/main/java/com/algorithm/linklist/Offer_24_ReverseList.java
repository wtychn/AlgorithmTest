package com.algorithm.linklist;

public class Offer_24_ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        while (head.next != null) {
            ListNode temp = head.next.next;
            head.next.next = cur;
            cur = head.next;
            head.next = temp;
        }
        return cur;
    }

    public ListNode reverseListByRecur(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = reverseListByRecur(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }
}
