package com.algorithm.array;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 删除子数组的最大得分  
 * @level mid
 * @author wtychn
 * @Date 2020/12/20
 */
public class LC_5630_MaximumUniqueSubarray {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int res = 0, max = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            res += key;
            if (numsMap.containsKey(key) && numsMap.get(key) >= left) {
                for (int j = left; j <= numsMap.get(key); j++) {
                    res -= nums[j];
                }
                left = numsMap.get(key) + 1;
            }
            max = Math.max(max, res);
            numsMap.put(key, i);
        }
        return max;
    }
}
