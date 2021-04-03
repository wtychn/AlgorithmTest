package com.algorithm.dynamic_programming;

import java.util.Stack;
/***
 * @Description: 接雨水  
 * @level hard
 * @author wtychn
 * @Date 2021/4/2
 */
public class LC_42_Trap {
    public int trap_dp(int[] height) {
        int n = height.length;
        if(n == 0) return 0;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; ++i) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; --i) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int res = 0;
        for (int i = 0; i < n; ++i) {
            res += Math.min(leftMax[i], rightMax[i]) - height[i];
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
                //每次选取矮的墙，如果出现多个等高的墙能够抵消
                int h = Math.min(height[cur], height[stack.peek()]) - lastHeight;
                res = res + w * h;
            }
            stack.push(cur);
            cur++;
        }
        return res;
    }

    public int trap_doublePointers(int[] height) {
        int left = 0, right = height.length - 1;
        int left_max = 0, right_max = 0;
        int res = 0;
        while (left < right) {
            left_max = Math.max(left_max, height[left]);
            right_max = Math.max(right_max, height[right]);
            // 每次移动小的那一边，保证不会计算溢出部分
            if (height[left] < height[right]) {
                res += left_max - height[left];
                left++;
            } else {
                res += right_max - height[right];
                right--;
            }
        }
        return res;
    }
}
