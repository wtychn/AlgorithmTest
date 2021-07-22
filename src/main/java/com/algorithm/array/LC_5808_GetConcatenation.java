package com.algorithm.array;
/***
 * @Description: 数组串联
 * @level easy
 * @author wtychn
 * @Date 2021/7/11
 */
public class LC_5808_GetConcatenation {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length << 1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }
        return ans;
    }
}
