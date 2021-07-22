package com.algorithm.array;
/***
 * @Description: 和相同的二元子数组
 * @level mid
 * @author wtychn
 * @Date 2021/7/8
 */
public class LC_930_NumSubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        // left1 停留在等于 goal 的第一位
        // left2 停留在小于 goal 的第一位
        int left1 = 0, left2 = 0, right = 0;
        int sum1 = 0, sum2 = 0;
        int ret = 0;
        while (right < n) {
            sum1 += nums[right];
            while (left1 <= right && sum1 > goal) {
                sum1 -= nums[left1];
                left1++;
            }
            sum2 += nums[right];
            while (left2 <= right && sum2 >= goal) {
                sum2 -= nums[left2];
                left2++;
            }
            ret += left2 - left1;
            right++;
        }
        return ret;
    }
}
