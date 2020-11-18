package com.algorithm.linklist;
/***
 * @Description: 反转链表
 * @level easy
 * @author wtychn
 * @Date 2020/10/23
 */
public class LC_206_ReverseList {
    ListNode res;
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            reverse(null, head);
            return res;
        }
    }

    private void reverse(ListNode pre, ListNode cur) {
        if (cur != null) {
            reverse(cur, cur.next);
            cur.next = pre;
        } else {
            res = pre;
        }
    }
}
