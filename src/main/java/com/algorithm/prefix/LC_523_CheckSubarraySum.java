package com.algorithm.prefix;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 连续的子数组和
 * @level mid
 * @author wtychn
 * @Date 2021/6/2
 */
public class LC_523_CheckSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length < 2) return false;
        // map 用来存每一位上的余数
        // (prefix[i] - prefix[j]) % k = 0 --> prefix[i] % k = prefix[j] % k
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int remainder = 0;
        for (int i = 0; i < nums.length; i++) {
            remainder = (remainder + nums[i]) % k;
            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) >= 2)
                    return true;
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }
}
