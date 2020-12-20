package com.algorithm.array;
/***
 * @Description: 最长摆动序列  
 * @level mid
 * @author wtychn
 * @Date 2020/12/12
 */
public class LC_376_WiggleMaxLength {
    public int wiggleMaxLength(int[] nums) {
        int up = 1, down = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 0) {
                up = down + 1;
            } else if (nums[i] - nums[i - 1] < 0) {
                down = up + 1;
            }
        }
        return nums.length == 0 ? 0 : Math.max(up, down);
    }
}
