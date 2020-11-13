package com.algorithm.linklist;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int x) { val = x; }

    public ListNode test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        return node1;
    }

    public List<Integer> toArray(ListNode node) {
        List<Integer> nodeList = new ArrayList<>();
        while (node != null) {
            nodeList.add(node.val);
            node = node.next;
        }
        return nodeList;
    }
}
