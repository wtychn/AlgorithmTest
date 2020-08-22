package com.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: AlgorithmTest
 * @description: offer57-2
 * @author: Mr.Wang
 * @create: 2020-07-26 13:29
 **/
public class Offer_57_2_FindContinuousSequences {
    public int[][] findContinuousSequences(int target) {
        int i = 1, j = 1;
        int sum = 0;
        List<int[]> res = new ArrayList<>();

        //i+1>i,所以当i<target/2时就该停止循环了
        while (i <= target / 2) {
            if (sum < target) {
                sum += j;
                j++;
            } else if (sum > target) {
                sum -= i;
                i++;
            } else {
                int[] arr = new int[j - i];
                for (int k = i; k < j; k++) {
                    arr[k - i] = k;
                }
                res.add(arr);
                sum -= 2 * i + 1;
                i += 2;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
