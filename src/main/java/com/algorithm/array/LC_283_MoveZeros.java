package com.algorithm.array;
/***
 * @Description: 移动零到末尾
 * @level easy
 * @author wtychn
 * @Date 2020/11/19
 */
public class LC_283_MoveZeros {
    public void moveZeros(int[] nums) {
        int changePoint = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != changePoint) {
                    nums[changePoint] = nums[i];
                    nums[i] = 0;
                }
                changePoint++;
            }
        }
    }
}
