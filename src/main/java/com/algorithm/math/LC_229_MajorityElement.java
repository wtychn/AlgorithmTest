package com.algorithm.math;

import java.util.*;

/***
 * @Description: 求众数 2
 * @level mid
 * @author wtychn
 * @Date 2021/10/22
 */
public class LC_229_MajorityElement {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        // 最终结果一定小于等于 2, 所以预设两个候选人
        int candidate1 = nums[0], count1 = 0;
        int candidate2 = nums[0], count2 = 0;
        // 投票阶段
        for (int num : nums) {
            if (candidate1 == num) {
                count1++;
                continue;
            }
            if (candidate2 == num) {
                count2++;
                continue;
            }
            if (count1 == 0) {
                candidate1 = num;
                count1++;
                continue;
            }
            if (count2 == 0) {
                candidate2 = num;
                count2++;
                continue;
            }
            count1--;
            count2--;
        }
        // 计数阶段
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            res.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            res.add(candidate2);
        }
        return res;
    }
}
