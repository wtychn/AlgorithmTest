package com.algorithm.array;

import java.util.HashSet;
import java.util.Set;
/***
 * @Description: 查找两个数组中相同的元素
 * @level easy
 * @author wtychn
 * @Date 2020/11/3
 */
public class LC_349_Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> same = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int n : nums1) {
            same.add(n);
        }
        for (int n : nums2) {
            if (same.contains(n)) res.add(n);
        }
        // 流式编程一步将set转为int[] set -> IntStream -> int[]
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}
