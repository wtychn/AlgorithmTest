package com.algorithm.dynamic_programming;
/***
 * @Description: 最长递增子序列
 * @level mid
 * @author wtychn
 * @Date 2021/4/23
 */
public class LC_300_LengthOfLTS {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int res = 0;
        for(int num : nums) {
            int i = 0, j = res;
            while(i < j) {
                int m = (i + j) / 2;
                if(tails[m] < num) i = m + 1;
                else j = m;
            }
            tails[i] = num;
            if(res == j) res++;
        }
        return res;
    }
}
