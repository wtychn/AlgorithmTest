package com.algorithm.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: AlgorithmTest
 * @description: lc1
 * @author: Mr.Wang
 * @create: 2020-08-10 15:35
 **/
public class LC_1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!indexMap.isEmpty() && indexMap.containsKey(target - nums[i])) {
                res[0] = indexMap.get(target - nums[i]);
                res[1] = i;
                break;
            }
            indexMap.put(nums[i], i);
        }
        return res;
    }
}
