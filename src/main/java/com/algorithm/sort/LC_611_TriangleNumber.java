package com.algorithm.sort;

import java.util.Arrays;
/***
 * @Description: 有效三角形的个数
 * @level mid
 * @author wtychn
 * @Date 2021/8/4
 */
public class LC_611_TriangleNumber {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int a = 0; a < nums.length - 2; a++) {
            int c = a;
            for (int b = a + 1; b < nums.length - 1; b++) {
                // 取 c + 1 是为了防止最后一位不满足要求的情况
                while (c + 1 < nums.length && nums[a] + nums[b] > nums[c + 1]) {
                    c++;
                }
                count += Math.max(c - b, 0);
            }
        }
        return count;
    }
}
