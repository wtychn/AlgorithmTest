package com.algorithm.linklist;

/***
 * @Description: 链表两两换位
 * @level mid
 * @author wtychn
 * @Date 2020/10/14
 */
public class LC_24_SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode left = head, right = head.next, pre = new ListNode(-1);
        head = head.next;
        while (left != null && right != null) {
            left.next = right.next;
            right.next = left;
            pre.next = right;
            pre = left;
            left = left.next;
            if(left != null) right = left.next;
        }
        return head;
    }
}
