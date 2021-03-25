package com.algorithm.search;

import java.util.Stack;
/***
 * @Description: 132模式  
 * @level mid
 * @author wtychn
 * @Date 2021/3/25
 */
public class LC_456_Find132pattern {
    public boolean find132pattern(int[] nums) {
        int[] min = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min[i] = Math.min(min[i - 1], nums[i]);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > min[i]) {
                while(!stack.isEmpty() && stack.peek() <= min[i]) stack.pop();
                if(!stack.isEmpty() && stack.peek() < nums[i]) return true;
                stack.push(nums[i]);
            }
        }
        return false;
    }
}
