package com.algorithm.array;
/***
 * @Description: 力扣跳跃游戏2
 * @level hw3
 * @author wtychn
 * @Date 2021/4/14
 */
public class HW_414_3 {
    public int solution(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
