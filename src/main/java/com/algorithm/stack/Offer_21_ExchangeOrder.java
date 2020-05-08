package com.algorithm.stack;

import java.util.Arrays;
import java.util.Stack;

public class Offer_21_ExchangeOrder {
    public int[] exchangeByStack(int[] nums) {
        Stack<Integer> odd = new Stack<>();
        Stack<Integer> even = new Stack<>();
        for (int i : nums) {
            if (i % 2 == 1) {
                odd.add(i);
            } else {
                even.add(i);
            }
        }
        while (!odd.isEmpty()) {
            even.push(odd.pop());
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i]=even.pop();
        }
        return res;
    }

    public int[] exchangeByPointer(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while (i < j) {
            while (i < j && nums[i] % 2 == 1) {
                i++;
            }
            while (i < j && nums[j] % 2 == 0) {
                j--;
            }
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
