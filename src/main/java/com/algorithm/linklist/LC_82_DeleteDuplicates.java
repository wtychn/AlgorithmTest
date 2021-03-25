package com.algorithm.linklist;
/***
 * @Description: 删除排序链表中的重复元素 II
 * @level mid
 * @author wtychn
 * @Date 2021/3/25
 */
public class LC_82_DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode domNode = new ListNode(-1, head);
        ListNode pre = domNode;
        while (pre.next != null) {
            ListNode cur = pre.next;
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                pre.next = cur.next;
            } else {
                pre = pre.next;
            }
        }
        return domNode.next;
    }
}
