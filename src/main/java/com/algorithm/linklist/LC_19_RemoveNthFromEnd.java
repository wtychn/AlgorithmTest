package com.algorithm.linklist;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: AlgorithmTest
 * @description: lc19
 * @author: Mr.Wang
 * @create: 2020-08-12 11:27
 **/
public class LC_19_RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        Map<Integer, ListNode> nodeMap = new HashMap<>();
        int index = 0;
        ListNode cur = head;
        while (cur != null) {
            nodeMap.put(index, cur);
            index++;
            cur = cur.next;
        }
        if (nodeMap.get(index - n - 1) == head) {
            head = head.next;
        } else {
            ListNode former = nodeMap.get(index - n - 1);
            former.next = former.next.next;
        }
        return head;
    }

    public ListNode removeNthFromEnd_doublePoint(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode former = dummy;
        ListNode later = dummy;
        for (int i = 0; i <= n; i++) {
            later = later.next;
        }
        while (later != null) {
            former = former.next;
            later = later.next;
        }
        former.next = former.next.next;
        return dummy.next;
    }
}
