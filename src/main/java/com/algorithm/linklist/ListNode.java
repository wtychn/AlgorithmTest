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
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;

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
