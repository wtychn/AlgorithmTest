package com.algorithm.math;

import java.util.Arrays;

/***
 * @Description: 最小操作次数使数组元素相等
 * @level easy
 * @author wtychn
 * @Date 2021/10/20
 */
public class LC_453_MinMoves {
    public int minMoves(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int res = 0;
        for (int num : nums) {
            res += num - min;
        }
        return res;
    }
}
