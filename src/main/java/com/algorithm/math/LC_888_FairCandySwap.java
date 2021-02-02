package com.algorithm.math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/***
 * @Description: 公平的糖果交换  
 * @level easy 
 * @author wtychn
 * @Date 2021/2/2
 */
public class LC_888_FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int delta = (sumA - sumB) / 2;
        int[] res = new int[2];
        Set<Integer> aSet = new HashSet<>();
        for (int a : A) {
            aSet.add(a);
        }
        for (int b : B) {
            int match = b + delta;
            if (aSet.contains(match)) {
                res[0] = match;
                res[1] = b;
                break;
            }
        }
        return res;
    }
}
