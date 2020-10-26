package com.algorithm.array;

import java.util.Arrays;
import java.util.Comparator;

/***
 * @Description: 找数组中比各位小的数的数量
 * @level easy
 * @author wtychn
 * @Date 2020/10/26
 */
public class LC_1365_SmallerNumbersThanCurrent {
    // 记录数组index后 先排序再找
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[][] index = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            index[i][0] = nums[i];
            index[i][1] = i;
        }
        Arrays.sort(index, Comparator.comparingInt(o -> o[0]));
        int[] res = new int[nums.length];
        int count = 0;
        for (int i = 0; i < index.length; i++) {
            if (i == 0 || index[i][0] != index[i - 1][0]) {
                count = i;
            }
            res[index[i][1]] = count;
        }
        return res;
    }

    // 建一个频次数组
    public int[] smallerNumbersThanCurrent_cnt(int[] nums) {
        int[] cnt = new int[101];
        for (int num : nums) {
            cnt[num]++;
        }
        // cnt[i] 存储的是在nums数组 i 之前有多少比它小的数
        for (int i = 1; i < cnt.length; i++) {
            cnt[i] += cnt[i - 1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] == 0 ? 0 : cnt[nums[i] - 1];
        }
        return res;
    }
}
