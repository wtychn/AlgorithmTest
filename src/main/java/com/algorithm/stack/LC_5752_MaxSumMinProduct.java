package com.algorithm.stack;

import java.util.Stack;
/***
 * @Description: 子数组最小乘积的最大值
 * @level mid
 * @author wtychn
 * @Date 2021/5/9
 */
public class LC_5752_MaxSumMinProduct {
    public int maxSumMinProduct(int[] nums) {
        // 先计算前缀和
        long[] prefixNums = new long[nums.length];
        prefixNums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixNums[i] = prefixNums[i - 1] + nums[i];
        }

        Stack<Integer> upStack = new Stack<>();
        long max = 0;
        // 数组元素 下标 人单调递增栈
        for (int i = 0; i < nums.length; i++) {
            // 每次出栈计算乘积
            while (!upStack.isEmpty() && nums[upStack.peek()] > nums[i]) {
                int minIndex = upStack.pop();
                int start = upStack.isEmpty() ? -1 : upStack.peek();
                int end = i - 1;
                max = Math.max(max, calcu(prefixNums, start, end, nums[minIndex]));
            }
            upStack.push(i);
        }
        // 栈中剩余元素依次出栈，并计算乘积
        while (!upStack.isEmpty()) {
            int minIndex = upStack.pop();
            int end = nums.length - 1;
            int start = upStack.isEmpty() ? -1 : upStack.peek();
            max = Math.max(max, calcu(prefixNums, start, end, nums[minIndex]));
        }
        return (int) (max % 1000000007);
    }

    // 求乘积
    private long calcu(long[] prefixNums, int start, int end, int min) {
        long sum = start == -1 ?
                prefixNums[end] :
                prefixNums[end] - prefixNums[start];
        return sum * min;
    }
}
