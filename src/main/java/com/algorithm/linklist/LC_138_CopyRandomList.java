package com.algorithm.linklist;

/***
 * @Description: 复制带随机指针的链表  
 * @level mid 
 * @author wtychn
 * @Date 2021/7/22
 */
public class LC_138_CopyRandomList {
    public ListNode copyRandomList(ListNode head) {
        if (head == null) {
            return null;
        }
        for (ListNode node = head; node != null; node = node.next.next) {
            ListNode nodeNew = new ListNode(node.val);
            nodeNew.next = node.next;
            node.next = nodeNew;
        }
        for (ListNode node = head; node != null; node = node.next.next) {
            ListNode nodeNew = node.next;
            nodeNew.random = (node.random != null) ? node.random.next : null;
        }
        ListNode headNew = head.next;
        for (ListNode node = head; node != null; node = node.next) {
            ListNode nodeNew = node.next;
            node.next = node.next.next;
            nodeNew.next = (nodeNew.next != null) ? nodeNew.next.next : null;
        }
        return headNew;
    }
}
