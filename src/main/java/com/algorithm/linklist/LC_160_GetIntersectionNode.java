package com.algorithm.linklist;
/***
 * @Description: 相交链表
 * @level easy
 * @author wtychn
 * @Date 2021/6/4
 */
public class LC_160_GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmpA = headA, tmpB = headB;
        while (tmpA != tmpB) {
            tmpA = tmpA == null ? headB : tmpA.next;
            tmpB = tmpB == null ? headA : tmpB.next;
        }
        return tmpA;
    }
}
