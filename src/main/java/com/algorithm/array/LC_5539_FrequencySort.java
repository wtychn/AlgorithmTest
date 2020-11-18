package com.algorithm.array;

import java.util.*;
/***
 * @Description: 根据数字出现频率对数组进行排序
 * @level easy
 * @author wtychn
 * @Date 2020/11/1
 */
public class LC_5539_FrequencySort {
    public int[] frequencySort(int[] nums) {
        if(nums.length == 1) return nums;
        // 创建treeset用于频率排序
        Set<Integer[]> freqSort = new TreeSet<>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                int num = o1[0] - o2[0];
                return num == 0 ? o2[1] - o1[1] : num; //频率相同就按数字降序排序
            }
        });

        Arrays.sort(nums);
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                freqSort.add(new Integer[]{count, nums[i - 1]});
                count = 1;
                if (i == nums.length - 1) {
                    freqSort.add(new Integer[]{count, nums[i]});
                }
            } else {
                count++;
                if (i == nums.length - 1) {
                    freqSort.add(new Integer[]{count, nums[i]});
                }
            }
        }

        int[] res = new int[nums.length];
        int index = 0;
        for (Integer[] freq : freqSort) {
            for (int i = 0; i < freq[0]; i++) {
                res[index] = freq[1];
                index++;
            }
        }
        return res;
    }
}
