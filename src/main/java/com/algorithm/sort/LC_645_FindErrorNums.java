package com.algorithm.sort;
/***
 * @Description: 错误的集合
 * @level easy
 * @author wtychn
 * @Date 2021/7/4
 */
public class LC_645_FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] buckets = new int[nums.length + 1];
        for (int num : nums) {
            buckets[num]++;
        }
        int[] res = new int[2];
        for (int i = 1; i < buckets.length; i++) {
            if(buckets[i] > 1) res[0] = i;
            else if(buckets[i] == 0) res[1] = i;
        }
        return res;
    }
}
