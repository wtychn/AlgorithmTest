package com.algorithm.array;
/***
 * @Description: 非递减数列  
 * @level easy 
 * @author wtychn
 * @Date 2021/2/7
 */
public class LC_665_CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                // 第一种可能：修改当前数字
                if (count > 1) return false;
                // 第二种可能：修改后方数字
                if (i > 0 && nums[i + 1] < nums[i - 1]) {
                    nums[i + 1] = nums[i];
                }
            }
        }
        return true;
    }
}
