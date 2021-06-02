package com.algorithm.prefix;

import java.util.*;
/***
 * @Description: 形成两个异或相等数组的三元组数目
 * @level mid
 * @author wtychn
 * @Date 2021/5/19
 */
public class LC_1442_CountTriplets {
    public int countTriplets(int[] arr) {
        int[] sum = new int[arr.length + 1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(sum[0], new ArrayList<>(Collections.singletonList(0)));
        int ans = 0;
        for (int k = 1; k < sum.length; k++) {
            sum[k] = sum[k - 1] ^ arr[k - 1];
            List<Integer> tmp = map.getOrDefault(sum[k], new ArrayList<>());
            for (Integer idx : tmp) {
                int i = idx + 1;
                ans += k - i;
            }
            tmp.add(k);
            map.put(sum[k], tmp);
        }
        return ans;
    }
}
