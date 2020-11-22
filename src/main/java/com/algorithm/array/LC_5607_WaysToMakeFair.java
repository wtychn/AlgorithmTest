package com.algorithm.array;

import java.util.ArrayList;
import java.util.List;
/***
 * @Description: 生成平衡数组的方案书
 * @level mid
 * @author wtychn
 * @Date 2020/11/22
 */
public class LC_5607_WaysToMakeFair {
    public int waysToMakeFair(int[] nums) {
        List<int[]> countList = new ArrayList<>(); //数组第一位奇数，第二位偶数
        int count = 0, odd = 0, even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even += nums[i];
            } else {
                odd += nums[i];
            }
            countList.add(new int[]{odd, even});
        }
        for (int i = 0; i < nums.length; i++) {
            int odd2, even2;
            if (i % 2 == 0) {
                odd2 = countList.get(i)[0] + even - countList.get(i)[1];
                even2 = countList.get(i)[1] - nums[i] + odd - countList.get(i)[0];
            } else {
                odd2 = countList.get(i)[0] - nums[i] + even - countList.get(i)[1];
                even2 = countList.get(i)[1] + odd - countList.get(i)[0];
            }
            if(odd2==even2) count++;
        }
        return count;
    }
}
