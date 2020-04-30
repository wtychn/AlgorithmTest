package com.algorithm.linklist;

public class Offer_18_DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val) return head.next;
        ListNode temp = head;
        ListNode help = head.next;
        while (help != null && help.val != val) {
            temp = temp.next;
            help = help.next;
        }
        if(help != null) {
            help = help.next;
            temp.next = help;
        }
        return head;
    }
}
