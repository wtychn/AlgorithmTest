package com.algorithm.math;

import java.util.Arrays;
/***
 * @Description: 最大数  
 * @level mid
 * @author wtychn
 * @Date 2021/4/12
 */
public class LC_179_LargestNumber {
    public String largestNumber(int[] nums) {
        Integer[] numsArr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsArr[i] = nums[i];
        }
        Arrays.sort(numsArr, (x, y) -> {
            long sx = 10, sy = 10;
            while (sx <= x) sx *= 10;
            while (sy <= y) sy *= 10;
            return (int) (sx * y + x - sy * x - y);
        });
        if(numsArr[0] == 0) return "0";
        StringBuilder sb = new StringBuilder();
        for (Integer num : numsArr) {
            sb.append(num);
        }
        return sb.toString();
    }
}

