package com.algorithm.linklist;

import java.util.HashSet;
import java.util.Set;

public class LC_141_HasCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        ListNode temp = head;

        while (temp != null) {
            if (nodeSet.contains(temp)) {
                return true;
            } else {
                nodeSet.add(temp);
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean hasCycle_doublePointer(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if(fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
