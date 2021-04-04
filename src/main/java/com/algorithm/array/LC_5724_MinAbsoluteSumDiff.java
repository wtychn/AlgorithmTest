package com.algorithm.array;

import java.util.Arrays;
/***
 * @Description: 绝对差值和  
 * @level mid 
 * @author wtychn
 * @Date 2021/4/4
 */
public class LC_5724_MinAbsoluteSumDiff {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        long sum = 0;
        int[] sort1 = Arrays.copyOf(nums1, nums1.length);
        Arrays.sort(sort1);
        for (int i = 0; i < nums1.length; i++) {
            sum += Math.abs(nums1[i] - nums2[i]);
        }

        long min = Long.MAX_VALUE;
        for (int i = 0; i < nums2.length; i++) {
            long tmp = sum;
            tmp -= Math.abs(nums1[i] - nums2[i]);

            if (nums2[i] >= sort1[sort1.length - 1]) {
                tmp += Math.abs(sort1[sort1.length - 1] - nums2[i]);
                min = Math.min(tmp, min);
            } else if (nums2[i] <= sort1[0]) {
                tmp += Math.abs(sort1[0] - nums2[i]);
                min = Math.min(tmp, min);
            } else {
                // 二分查找 num1 中与 nums2 最接近的值
                int l = 0, r = sort1.length - 1;
                while (l <= r) {
                    int m = (l + r) / 2;
                    if (sort1[m] > nums2[i]) {
                        r = m - 1;
                    } else {
                        if (sort1[m + 1] >= nums2[i]) {
                            tmp += Math.min(Math.abs(sort1[m] - nums2[i]), Math.abs(sort1[m + 1] - nums2[i]));
                            min = Math.min(tmp, min);
                            break;
                        } else {
                            l = m + 1;
                        }
                    }
                }
            }
        }
        return (int) (min % 1000000007);
    }
}
