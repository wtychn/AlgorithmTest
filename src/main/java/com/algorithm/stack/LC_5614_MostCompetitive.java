package com.algorithm.stack;

import java.util.Stack;
/***
 * @Description: 找出最小的子序列
 * @level mid
 * @author wtychn
 * @Date 2020/11/29
 */
public class LC_5614_MostCompetitive {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> resStack = new Stack<>();
        resStack.add(nums[0]);
        int[] res = new int[k];
        for (int i = 1; i < nums.length; i++) {
            while (!resStack.isEmpty() &&
                    nums[i] < resStack.peek() &&
                    nums.length - i > k - resStack.size()) {
                resStack.pop();
            }
            if (resStack.size() < k) {
                resStack.add(nums[i]);
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            res[i] = resStack.pop();
        }
        return res;
    }
}
