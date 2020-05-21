package com.algorithm.stack;

import java.util.Stack;

public class Offer_31_ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int popIndex = 0;
        Stack<Integer> stack = new Stack<>();
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
