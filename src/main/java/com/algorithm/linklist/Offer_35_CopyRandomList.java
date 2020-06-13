package com.algorithm.linklist;

import java.util.HashMap;

class RandomNode {
    int val;
    RandomNode next;
    RandomNode random;

    public RandomNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Offer_35_CopyRandomList {
    public RandomNode copyRandomList(RandomNode head) {
        //使用hashmap存入原链表节点和复制链表节点，后面设置复制链表random指针时直接将原链表节点作为key取出复制链表random节点
        HashMap<RandomNode, RandomNode> nodeMap = new HashMap<>();
        if (head == null) return null;
        RandomNode res = new RandomNode(head.val);
        RandomNode tmp = head;//原链表辅助指针
        RandomNode helper = res;//复制链表辅助指针
        while (tmp.next != null) {
            helper.next = new RandomNode(tmp.next.val);
            tmp = tmp.next;
            helper = helper.next;
            nodeMap.put(tmp, helper);
        }
        tmp = head;
        helper = res;
        while (tmp != null) {
            if (tmp.random != null) {
                helper.random = nodeMap.get(helper.random);
            }
            tmp = tmp.next;
            helper = helper.next;
        }
        return res;
    }
}
