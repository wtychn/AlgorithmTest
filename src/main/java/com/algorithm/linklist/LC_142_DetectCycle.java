package com.algorithm.linklist;

/***
 * @Description: 找环形链表入口
 * @level mid
 * @author wtychn
 * @Date 2020/10/10
 */
public class LC_142_DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head, fast = head.next;
        //第一次相遇，此时 s = nb、f = 2nb
        while (slow != fast) {
            if(fast == null || fast.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
        }
        //将 f重置到起始点 head
        fast = head;
        //第二次相遇时 s = a + nb, 即已经处在链表环入口
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
