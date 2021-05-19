package com.algorithm.hash;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 找出和为指定值的下标对
 * @level mid
 * @author wtychn
 * @Date 2021/5/16
 */
public class LC_5761_FindSumPairs {
    int[] nums1, nums2;
    Map<Integer, Integer> map = new HashMap<>();

    public LC_5761_FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for (int num : nums2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        if(map.get(nums2[index]) == 1) map.remove(nums2[index]);
        else map.put(nums2[index], map.get(nums2[index]) - 1);
        nums2[index] += val;
        map.put(nums2[index], map.getOrDefault(nums2[index], 0) + 1);
    }

    public int count(int tot) {
        int res = 0;
        for (int num : nums1) {
            if(map.containsKey(tot - num))
                res += map.get(tot - num);
        }
        return res;
    }
}
