package com.algorithm.array;
/***
 * @Description: 子数组最大平均数1  
 * @level easy 
 * @author wtychn
 * @Date 2021/2/4
 */
public class LC_643_FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }
        return (float) max / k;
    }
}
