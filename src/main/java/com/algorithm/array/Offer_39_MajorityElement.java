package com.algorithm.array;

import java.util.HashMap;

public class Offer_39_MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mapping = new HashMap<>();
        for (Integer num : nums) {
            if (mapping.containsKey(num)) {
                int count = mapping.get(num) + 1;
                mapping.put(num, count);
                if (count > nums.length / 2) {
                    return num;
                }
            } else {
                mapping.put(num, 1);
            }
        }
        return -1;
    }
}
