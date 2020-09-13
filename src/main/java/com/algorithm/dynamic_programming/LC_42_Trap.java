package com.algorithm.dynamic_programming;

import java.util.Stack;

public class LC_42_Trap {
    public int trap_dp(int[] height) {
        int res = 0;
        int leftMax = 0, rightMax = 0; //两个变量动态存储最大值
        int left = 1, right = height.length - 2; //双指针
        for (int i = 1; i < height.length; i++) {
            if (height[left - 1] < height[right + 1]) {
                leftMax = Math.max(leftMax, height[left - 1]);
                if (height[left] < leftMax) {
                    res = res + (leftMax - height[left]);
                }
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right + 1]);
                if (height[right] < rightMax) {
                    res = res + (rightMax - height[right]);
                }
                right--;
            }
        }
        return res;
    }

    public int trap_stack(int[] height) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        while (cur < height.length) {
            while (!stack.isEmpty() && height[stack.peek()] < height[cur]) {
                int lastHeight = height[stack.pop()]; //记录上一个出栈的墙的高度
                if(stack.isEmpty()) break;

                int w = cur - stack.peek() - 1;
                int h = Math.min(height[cur], height[stack.peek()]) - lastHeight;
                res = res + w * h;
            }
            stack.push(cur);
            cur++;
        }
        return res;
    }
}
