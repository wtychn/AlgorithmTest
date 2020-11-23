package com.algorithm.linklist;

public class Offer_25_MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //result作为伪头结点辅助，不然无法成功返回
        ListNode result = new ListNode(0);
        ListNode help = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                help.next = l1;
                l1 = l1.next;
            } else {
                help.next = l2;
                l2 = l2.next;
            }
            help = help.next;
        }
        help.next = l1 == null ? l2 : l1;
        return result.next;
    }
}
