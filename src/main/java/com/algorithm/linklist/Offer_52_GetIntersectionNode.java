package com.algorithm.linklist;

/**
 * @program: AlgorithmTest
 * @description: offer52
 * @author: Mr.Wang
 * @create: 2020-07-22 17:56
 **/
public class Offer_52_GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode curA = headA, curB = headB;
        int count = 0;
        while (curA != curB) {
            if (count > 1) return null;

            if (curA.next == null) {
                curA = headB;
                count++;
            } else
                curA = curA.next;

            curB = curB.next == null ? headA : curB.next;
        }
        return curA;
    }
}
