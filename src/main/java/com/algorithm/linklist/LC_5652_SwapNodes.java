package com.algorithm.linklist;
/***
 * @Description: 交换链表中的节点  
 * @level mid 
 * @author wtychn
 * @Date 2021/1/10
 */
public class LC_5652_SwapNodes {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode firstK, beforeF, lastK, beforeL;
        ListNode fake = new ListNode();
        fake.next = head;
        ListNode slow = fake;
        int count = 1;
        while (count < k) {
            slow = slow.next;
            count++;
        }
        beforeF = slow;
        firstK = slow.next;
        while (slow.next.next != null) {
            slow = slow.next;
            count++;
        }
        if(count == 1) return head;
        count = count - k + 1;
        int count2 = 1;
        slow = fake;
        while (count2 < count) {
            slow = slow.next;
            count2++;
        }
        beforeL = slow;
        lastK = slow.next;
        //exchange
        ListNode temp;
        beforeF.next = lastK;
        temp = lastK.next;
        if (firstK.next == lastK) {
            lastK.next = firstK;
        } else {
            lastK.next = firstK.next;
            beforeL.next = firstK;
        }
        firstK.next = temp;
        return fake.next;
    }
}
