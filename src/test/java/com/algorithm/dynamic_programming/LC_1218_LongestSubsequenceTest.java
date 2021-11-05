package com.algorithm.dynamic_programming;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_1218_LongestSubsequenceTest {

    @Test
    public void longestSubsequence() {
        int[] nums = {4, 12, 10, 0, -2, 7, -8, 9, -9, -12, -12, 8, 8};
        LC_1218_LongestSubsequence l = new LC_1218_LongestSubsequence();
        System.out.println(l.longestSubsequence(nums, 0));
    }
}