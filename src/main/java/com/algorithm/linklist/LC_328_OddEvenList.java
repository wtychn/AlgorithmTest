package com.algorithm.linklist;
/***
 * @Description: 把链表的奇数节点和偶数节点分别排在一起
 * @level mid
 * @author wtychn
 * @Date 2020/11/13
 */
public class LC_328_OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode help = head.next;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = help;
        return head;
    }
}
