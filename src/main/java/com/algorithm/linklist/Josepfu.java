package com.algorithm.linklist;

public class Josepfu {
    public int lastRemaining(int n, int m) {

        CircleSingleLinkList circleSingleLinkList = new CircleSingleLinkList(n);

        return circleSingleLinkList.getRemainNode(m);
    }
}

class Node{
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class CircleSingleLinkList{
    private Node first = null;

    public CircleSingleLinkList(int n) {
        Node curNode = null;
        for (int i = 0; i < n; i++) {
            Node node = new Node(i);
            if (first == null) {
                first = node;
                first.setNext(first);
                curNode = first;
            } else {
                curNode.setNext(node);
                node.setNext(first);
                curNode = node;
            }
        }
    }

    public int getRemainNode(int m) {
        Node helper = first;
        while (helper.getNext() != first) {
            helper = helper.getNext();
        }
        while (helper != first) {
            for (int i = 0; i < m-1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            first = first.getNext();
            helper.setNext(first);
        }
        return helper.getValue();
    }
}