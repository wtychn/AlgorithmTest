package com.algorithm.linklist;
/***
 * @Description: 移除链表元素
 * @level easy
 * @author wtychn
 * @Date 2021/6/5
 */
public class LC_203_RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dumb = new ListNode(0);
        dumb.next = head;
        ListNode cur = dumb;
        while (cur.next != null) {
            if(cur.next.val == val) cur.next = cur.next.next;
            else cur = cur.next;
        }
        return dumb.next;
    }
}
