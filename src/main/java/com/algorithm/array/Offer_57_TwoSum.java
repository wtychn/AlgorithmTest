package com.algorithm.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: AlgorithmTest
 * @description: offer57
 * @author: Mr.Wang
 * @create: 2020-07-25 16:32
 **/
public class Offer_57_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> integerSet = new HashSet<>();
        int[] result = new int[2];
        for (int num : nums) {
            if (integerSet.contains(target - num)) {
                result[0] = num;
                result[1] = target - num;
                return result;
            }
            integerSet.add(num);
        }
        return result;
    }
}
