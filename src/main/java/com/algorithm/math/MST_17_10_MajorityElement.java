package com.algorithm.math;

public class MST_17_10_MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;
        for (int num : nums) {
            if(count == 0) candidate = num;
            count += num == candidate ? 1 : -1;
        }
        count = 0;
        for (int num : nums) {
            count += num == candidate ? 1 : 0;
        }
        return count > nums.length / 2 ? candidate : -1;
    }
}
