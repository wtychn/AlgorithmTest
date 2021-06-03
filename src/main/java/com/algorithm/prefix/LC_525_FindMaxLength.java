package com.algorithm.prefix;

import java.util.HashMap;
import java.util.Map;
/***
 * @Description: 连续数组
 * @level mid
 * @author wtychn
 * @Date 2021/6/3
 */
public class LC_525_FindMaxLength {
    public int findMaxLength(int[] nums) {
        int sum = 0, max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}
