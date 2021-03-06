package com.algorithm.linklist;
/***
 * @Description: 旋转链表  
 * @level mid
 * @author wtychn
 * @Date 2021/3/29
 */
public class LC_61_RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null) return null;
        ListNode right = head;
        int count = 1;
        while (right.next != null) {
            right = right.next;
            count++;
        }
        int n = count - k % count;
        if(n == count) return head;
        right.next = head;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        ListNode newHead = right.next;
        right.next = null;
        return newHead;
    }
}
