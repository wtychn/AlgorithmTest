package com.algorithm.stack;

import java.util.Stack;

public class Offer_9_QueueByStacks {
    Stack<Integer> appendStack;
    Stack<Integer> deleteStack;
    public Offer_9_QueueByStacks() {
        appendStack = new Stack<>();
        deleteStack = new Stack<>();
    }

    public void appendTail(int value) {
        while (!deleteStack.isEmpty()) {
            appendStack.add(deleteStack.pop());
        }
        appendStack.add(value);
    }

    public int deleteHead() {
        while (!appendStack.isEmpty()) {
            deleteStack.add(appendStack.pop());
        }
        if (deleteStack.isEmpty()) {
            return -1;
        }
        return deleteStack.pop();
    }
}
