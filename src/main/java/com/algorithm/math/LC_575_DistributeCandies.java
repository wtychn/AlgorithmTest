package com.algorithm.math;

import java.util.HashSet;
import java.util.Set;

/***
 * @Description: 分糖果
 * @level easy
 * @author wtychn
 * @Date 2021/11/1
 */
public class LC_575_DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> freq = new HashSet<>();
        for (int candy : candyType) {
            freq.add(candy);
        }
        return Math.min(freq.size(), candyType.length / 2);
    }
}
